package com.itsanubhav.bletester.blemanagers

import android.annotation.SuppressLint
import android.bluetooth.*
import android.bluetooth.le.*
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Build.VERSION.SDK_INT
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.itsanubhav.bletester.config.UIDS
import com.itsanubhav.bletester.events.CharacteristicChangeEvent
import com.itsanubhav.bletester.events.ConnectionStateEvent
import org.greenrobot.eventbus.EventBus
import java.util.*


@SuppressLint("MissingPermission")
abstract class BaseBleManager(mContext: Context) : BluetoothGattCallback() {

    private val _scanTimeout = 10000
    private val _connectTimeout = 10000
    private val mContext : Context
    private var bluetoothAdapter : BluetoothAdapter
    private var bluetoothManager : BluetoothManager
    private var bluetoothLeScanner : BluetoothLeScanner
    private val deviceGattMap = mutableMapOf<BluetoothDevice,BluetoothGatt>()
    private var writeCharacteristic: BluetoothGattCharacteristic? = null
    private val listReadData = mutableListOf<ByteArray>()
    private var isSendData = false
    private var handler : Handler
    private var sendDataRunnable : SendDataRunnable? = null

    private val bluetoothScanCallback: ScanCallback = object : ScanCallback() {
        override fun onScanResult(callbackType: Int, result: ScanResult) {
            Log.e("ScanResult","Device: ${result.device.name} ${result.device.address}")
        }

        override fun onBatchScanResults(results: List<ScanResult>) {
            super.onBatchScanResults(results)
        }

        override fun onScanFailed(errorCode: Int) {
            super.onScanFailed(errorCode)
        }
    }

    init {
        this.mContext = mContext
        bluetoothManager = getContext().getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        bluetoothAdapter = bluetoothManager.adapter
        bluetoothLeScanner = bluetoothAdapter.bluetoothLeScanner

        handler = Handler(Looper.getMainLooper())
    }

    fun startScan(){
        //Scan filters will be passed
        val scanFilter = ScanFilter.Builder()
                .build()
        val scanSettings = ScanSettings.Builder()
            .build()
        bluetoothAdapter.bluetoothLeScanner.startScan(listOf(scanFilter),scanSettings,bluetoothScanCallback)
    }

    fun stopScan(){
        bluetoothAdapter.bluetoothLeScanner.stopScan(bluetoothScanCallback)
    }

    fun simpleConnect(address: String){
        val device = getDeviceByAddress(address)
        if (SDK_INT >= Build.VERSION_CODES.M) {
            device.connectGatt(mContext, false, this, BluetoothDevice.TRANSPORT_LE)
        } else {
            device.connectGatt(mContext, false, this)
        }
    }

    override fun onConnectionStateChange(gatt: BluetoothGatt?, status: Int, newState: Int) {
        super.onConnectionStateChange(gatt, status, newState)
        when(newState){
            BluetoothProfile.STATE_CONNECTING -> {}
            BluetoothProfile.STATE_CONNECTED -> {
                handler.post { gatt?.discoverServices() }
                addConnectedGatt(gatt)
            }
            BluetoothProfile.STATE_DISCONNECTING -> {}
            BluetoothProfile.STATE_DISCONNECTED -> {
                isSendData = false
                gatt?.close()
                removeDisconnectedGatt(gatt)
            }
        }
        if (gatt!=null)
            EventBus.getDefault().post(ConnectionStateEvent(oldState = status, newState = newState, device = gatt.device))
    }

    open fun addConnectedGatt(gatt: BluetoothGatt?){
        /*
        * Call this method everytime a device is connected
        * to ensure we always maintain a list of active device
        * */
        if (gatt!=null){
            if (deviceGattMap.containsKey(gatt.device)){
                deviceGattMap.remove(gatt.device)
            }
            deviceGattMap[gatt.device] = gatt
        }
    }

    private fun removeDisconnectedGatt(gatt: BluetoothGatt?){
        if (gatt!=null){
            if (deviceGattMap.containsKey(gatt.device)){
                deviceGattMap.remove(gatt.device)
            }
        }
    }

    fun disconnect(device: BluetoothDevice){
        if (deviceGattMap.containsKey(device)){
            deviceGattMap[device]?.disconnect()
        }else{
            Log.e("Disconnect","Gatt not found")
            //throw BleException("${device.address} is not connected. Cannot find the gatt")
        }
    }

    fun getDeviceByAddress(address: String) : BluetoothDevice{
        return bluetoothAdapter.getRemoteDevice(address)
    }

    open fun disconnectAllDevices(){
        for (deviceGatt in deviceGattMap.values){
            deviceGatt.disconnect()
        }
    }

    fun isConnected(address: String) : Boolean{
        val device = getDeviceByAddress(address)
        val connectionState = bluetoothManager.getConnectionState(device,BluetoothProfile.GATT)
        return connectionState == BluetoothProfile.STATE_CONNECTED
    }



    fun getConnectedDevices() : List<BluetoothDevice>{
        return deviceGattMap.keys.toList()
    }

    fun checkIfSupportBle(): Boolean {
        return getContext().packageManager.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)
    }

    fun getBluetoothGatt(device: BluetoothDevice) : BluetoothGatt? {
        return deviceGattMap[device]
    }

    private fun getContext(): Context {
        return mContext
    }

    fun write(device : BluetoothDevice, value : ByteArray) : Boolean{
//        val characteristic: BluetoothGattCharacteristic?
//        val service: BluetoothGattService = deviceGattMap[device]?.getService(UIDS.SERVICE_DATA)
//            ?:
//            return false
//        characteristic = service.getCharacteristic(UIDS.DATA_Characteristic)
//        if (characteristic == null) {
//            return false
//        }
//
//        characteristic.value = value
//        deviceGattMap[device]?.writeCharacteristic(characteristic)
        writeValue(device,value)
        return true
    }

    private fun writeValue(device : BluetoothDevice, buffer: ByteArray?) {
        // �ж��Ƿ����ڷ�������
        if (isSendData) {
            if (sendDataRunnable != null && buffer !=null) {
                sendDataRunnable!!.addData(buffer)
            }
        } else {
            // �񣬿��Է�������
            isSendData = true
            // ÿ�η�������֮ǰ������ѱ���Ķ�ȡ����
            listReadData.clear()
            if (buffer!=null) {
                sendDataRunnable = SendDataRunnable(buffer,device)
            }
            sendDataRunnable?.let {
                handler.post(it)
            }
        }
    }


    inner class SendDataRunnable internal constructor(buffer: ByteArray, device: BluetoothDevice) : Runnable {
        private val listData: MutableList<ByteArray>
        private var currentDevice: BluetoothDevice

        /**
         * ��ǰ���ʹ���
         */
        private var currentSendFrequency: Int
        override fun run() {
            if (currentSendFrequency >= listData.size) {
                return
            }
            val buffer = listData[currentSendFrequency]
            val bluetoothGatt = deviceGattMap[currentDevice]
            if (writeCharacteristic != null && bluetoothGatt != null) {
                writeCharacteristic!!.value = buffer
                bluetoothGatt.writeCharacteristic(writeCharacteristic)
            }
            currentSendFrequency++
            if (currentSendFrequency >= listData.size) {
                sendDataRunnable?.let { handler.removeCallbacks(it) }
                sendDataRunnable = null
                isSendData = false
            }
        }


        fun addData(buffer: ByteArray) {
            for (i in 0 until buffer.size / 20) {
                val bytes = ByteArray(20)
                System.arraycopy(buffer, i * 20, bytes, 0, 20)
                listData.add(bytes)
            }
            if (buffer.size % 20 != 0) {
                val bytes = ByteArray(buffer.size % 20)
                System.arraycopy(buffer, buffer.size / 20 * 20, bytes, 0, bytes.size)
                listData.add(bytes)
            }
        }

        init {
            listData = ArrayList()
            currentDevice = device
            currentSendFrequency = 0
            for (i in 0 until buffer.size / 20) {
                val bytes = ByteArray(20)
                System.arraycopy(buffer, i * 20, bytes, 0, 20)
                listData.add(bytes)
            }
            if (buffer.size % 20 != 0) {
                // ���ǣ�˵������һ��������Ҫ����
                val bytes = ByteArray(buffer.size % 20)
                System.arraycopy(buffer, buffer.size / 20 * 20, bytes, 0, bytes.size)
                listData.add(bytes)
            }
        }
    }

    override fun onServicesDiscovered(gatt: BluetoothGatt?, status: Int) {
        if (status == BluetoothGatt.GATT_SUCCESS) {
            val uid = UIDS.TresUuids
            val bluetoothGattService = gatt!!.getService(uid.SERVICE)
            writeCharacteristic =
                bluetoothGattService.getCharacteristic(uid.WRITE)
            val readCharacteristic =
                bluetoothGattService.getCharacteristic(uid.READ)
            gatt.setCharacteristicNotification(readCharacteristic, true)
            val descriptor =
                readCharacteristic.getDescriptor(uid.SYSTEM)
            descriptor.value = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
            gatt.writeDescriptor(descriptor)
        }
        super.onServicesDiscovered(gatt, status)
    }

    override fun onCharacteristicChanged(
        gatt: BluetoothGatt?,
        characteristic: BluetoothGattCharacteristic?
    ) {
        val buffer = characteristic!!.value
        Log.d(
            this::class.java.simpleName,
            "onCharacteristicChanged:" + Arrays.toString(buffer)
        )
        if (isSendData) {
            listReadData.add(buffer)
            return
        }
        if (EventBus.getDefault().isRegistered(mContext)) {
            if (listReadData.isNotEmpty()) {
                for (readData in listReadData) {
                    val device = gatt!!.device
                    EventBus.getDefault().post(CharacteristicChangeEvent(device,buffer))
                }
                listReadData.clear()
            }
            val device = gatt!!.device
            EventBus.getDefault().post(CharacteristicChangeEvent(device,buffer))
        }else{
            Log.e(this.javaClass.simpleName,"onCharacteristicChanged: Eventbus is not registered")
        }
        super.onCharacteristicChanged(gatt, characteristic)
    }

    override fun onCharacteristicRead(
        gatt: BluetoothGatt?,
        characteristic: BluetoothGattCharacteristic?,
        status: Int
    ) {
        super.onCharacteristicRead(gatt, characteristic, status)
    }

    override fun onCharacteristicWrite(
        gatt: BluetoothGatt?,
        characteristic: BluetoothGattCharacteristic?,
        status: Int
    ) {
        super.onCharacteristicWrite(gatt, characteristic, status)
        if (status == BluetoothGatt.GATT_SUCCESS && isSendData && sendDataRunnable != null) {
            handler.post(sendDataRunnable!!)
        }
    }

    override fun onDescriptorRead(
        gatt: BluetoothGatt?,
        descriptor: BluetoothGattDescriptor?,
        status: Int
    ) {
        if (status == BluetoothGatt.GATT_SUCCESS) {
            Log.d(this::class.java.simpleName, "onDescriptorRead gatt success")
        } else {
            Log.d(this::class.java.simpleName, "onDescriptorRead gatt failure")
        }
        super.onDescriptorRead(gatt, descriptor, status)
    }

    override fun onDescriptorWrite(
        gatt: BluetoothGatt?,
        descriptor: BluetoothGattDescriptor?,
        status: Int
    ) {
        if (status == BluetoothGatt.GATT_SUCCESS) {
            Log.d(
                this::class.java.simpleName,
                "onDescriptorWrite gatt success"
            )
//                bleConnectState = BleEnum.BleConnectState.CONNECTED
//                if (bleConnectStateListener != null) {
//                    val device = gatt!!.device
//                    bleConnectStateListener.onConnectState(device, bleConnectState)
//                }
        } else {
//                bleConnectState = BleEnum.BleConnectState.CONNECTION_FAILED
//                if (bleConnectStateListener != null) {
//                    // ��ӦBle����״̬�ļ���
//                    val device = gatt!!.device
//                    bleConnectStateListener.onConnectState(device, bleConnectState)
//                }
//
//                bluetoothGatt.disconnect()
//                if (bluetoothGatt != null) {
//                    // �رմ�����GATT�ͻ���
//                    bluetoothGatt.close()
//                    bluetoothGatt = null
//                }
            Log.d(
                this::class.java.simpleName,
                "onDescriptorWrite gatt failure"
            )
        }
        super.onDescriptorWrite(gatt, descriptor, status)
    }


}