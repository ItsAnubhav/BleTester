package com.itsanubhav.bletester.blemanagers.blaze

import android.bluetooth.BluetoothDevice
import android.content.Context
import com.itsanubhav.bletester.blemanagers.BaseBleManager

class BlazeBleManager(context: Context) : BaseBleManager(context) {

    fun connect(address: String){
        super.simpleConnect(address)
    }

}