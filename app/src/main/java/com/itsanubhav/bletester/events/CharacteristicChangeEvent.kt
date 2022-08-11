package com.itsanubhav.bletester.events

import android.bluetooth.BluetoothDevice

data class CharacteristicChangeEvent(
    val device: BluetoothDevice,
    val buffer: ByteArray
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CharacteristicChangeEvent

        if (device != other.device) return false
        if (!buffer.contentEquals(other.buffer)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = device.hashCode()
        result = 31 * result + buffer.contentHashCode()
        return result
    }
}
