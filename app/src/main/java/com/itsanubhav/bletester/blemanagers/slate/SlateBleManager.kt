package com.itsanubhav.bletester.blemanagers.slate

import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCallback
import android.bluetooth.BluetoothGattCharacteristic
import android.content.Context
import android.util.Log
import com.itsanubhav.bletester.blemanagers.BaseBleManager
import com.waterworld.watchsdk.ProtocolAppToDevice
import com.waterworld.watchsdk.entity.DataEnum
import com.waterworld.watchsdk.entity.MessageSwitch


class SlateBleManager(context: Context) : BaseBleManager(context) {

    lateinit var device : BluetoothDevice

    fun connect(address: String){
        super.simpleConnect(address)
        device = super.getDeviceByAddress(address)
    }

    fun disconnectdev(device : BluetoothDevice){
        super.disconnect(device)
    }

    fun appSync(isFirstTime : Boolean){
        val callSwitchState = DataEnum.SwitchState.OPEN
        val smsSwitchState = DataEnum.SwitchState.OPEN
        val messageSwitchState = DataEnum.SwitchState.OPEN
        val messageSwitch = MessageSwitch()
        messageSwitch.messageSwitch = DataEnum.SwitchState.OPEN
        val buffer = ProtocolAppToDevice.appSync(
            1, DataEnum.GenderType.MALE, 28, 173, 68,
            DataEnum.WearHandType.LEFT_HAND, DataEnum.LanguageType.ENGLISH,
            System.currentTimeMillis(), DataEnum.TimeFormat.TWENTY_FOUR,
            DataEnum.DateFormat.MONTH_DAY, DataEnum.SwitchState.OPEN,
            callSwitchState, smsSwitchState, messageSwitchState, messageSwitch, isFirstTime
        )
        sendData(buffer)
    }

    private fun sendData(data : ByteArray){
        if (isConnected(device.address)) {
            super.write(device, data)
        }else{
            Log.d("SlateBleManager","${device.address} Device is not connected")
        }
    }


}