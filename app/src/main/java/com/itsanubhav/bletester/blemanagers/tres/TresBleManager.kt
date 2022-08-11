package com.itsanubhav.bletester.blemanagers.tres

import android.bluetooth.BluetoothDevice
import android.content.Context
import com.itsanubhav.bletester.blemanagers.BaseBleManager
import com.jstyle.blesdk1963_03.Util.BleSDK
import com.jstyle.blesdk1963_03.model.MyDeviceInfo
import java.util.*


class TresBleManager(mContext: Context) : BaseBleManager(mContext) {
    lateinit var device : BluetoothDevice

    init {
        //Initialize Watch wise logic here
        //Hilt provides a singleton of this class so we do not have to manage instances ourselves
    }



    fun connect(address: String){
        super.simpleConnect(address)
        device = super.getDeviceByAddress(address)
    }

    fun changeLanguage(){
        val deviceBaseParameter = MyDeviceInfo()
        deviceBaseParameter.isDistanceUnit = Random().nextBoolean()
        deviceBaseParameter.isIs12Hour = Random().nextBoolean()
        deviceBaseParameter.isFahrenheit_or_centigrade = Random().nextBoolean()
        val data = BleSDK.SetDeviceInfo(deviceBaseParameter)
        sendData(data)
    }

    private fun sendData(data: ByteArray){
        super.write(device,data)
    }



}