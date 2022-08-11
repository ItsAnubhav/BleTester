package com.itsanubhav.bletester.ui.home

import android.bluetooth.BluetoothDevice
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.itsanubhav.bletester.blemanagers.MyBleManager
import dagger.hilt.android.lifecycle.HiltViewModel
import java.net.Inet4Address
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(bleManager: MyBleManager): ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
    val _bleManager = bleManager
    lateinit var device : BluetoothDevice

    fun initialize(address: String){
        device = _bleManager.getDeviceByAddress(address)
    }

    fun connectDevice(address: String, name: String){

        _bleManager.connect(address,name)
    }

    fun disconnectDevice(address: String, name: String){
        _bleManager.disconnect(device)
    }

    fun syncDevice(){
        _bleManager.appSync(true)
    }

    fun fetchHr(){
        _bleManager.fetchHeartRate()
    }

    fun changeLanguage(){
        _bleManager.changeLanguage()
    }

    fun isConnected() : Boolean{
        return _bleManager.isConnected(device.address)
    }


}