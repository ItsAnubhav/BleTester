package com.itsanubhav.bletester.events

import android.bluetooth.BluetoothDevice

data class ConnectionStateEvent(
    val oldState : Int,
    val newState : Int,
    val device : BluetoothDevice
)
