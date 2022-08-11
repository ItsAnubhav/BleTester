package com.itsanubhav.bletester.config

import kotlinx.coroutines.flow.merge

class Config{
    companion object{
        val slateDeviceNameArray = arrayOf("HT5","SLATE")
        val blazeDeviceNameArray = arrayOf("BLAZE")
        val tresDeviceNameArray = arrayOf("CARE")

        //Supported watch name filters
        val supportedDeviceNames = mutableListOf<String>().also {
            it.addAll(slateDeviceNameArray)
            it.addAll(blazeDeviceNameArray)
            it.addAll(tresDeviceNameArray)
        }
    }

}
