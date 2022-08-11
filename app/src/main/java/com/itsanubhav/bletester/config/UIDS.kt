package com.itsanubhav.bletester.config

import java.util.*

object UIDS {

    object TresUuids {
        val SYSTEM: UUID = UUID
            .fromString("00002902-0000-1000-8000-00805f9b34fb")
        val SERVICE: UUID = UUID
            .fromString("0000fff0-0000-1000-8000-00805f9b34fb")
        val WRITE: UUID = UUID
            .fromString("0000fff6-0000-1000-8000-00805f9b34fb")
        val READ: UUID = UUID
            .fromString("0000fff7-0000-1000-8000-00805f9b34fb")
    }


    object SlateUuids{
        val SERVICE: UUID? = UUID
            .fromString("0000f618-0000-1000-8000-00805f9b34fb")
        val WRITE: UUID = UUID
            .fromString("0000b002-0000-1000-8000-00805f9b34fb")
        val READ : UUID = UUID
            .fromString("0000b001-0000-1000-8000-00805f9b34fb")
        val SYSTEM : UUID = UUID
            .fromString("00002902-0000-1000-8000-00805f9b34fb")
    }

}