package com.itsanubhav.bletester.blemanagers

import android.content.Context
import com.itsanubhav.bletester.blemanagers.blaze.BlazeBleManager
import com.itsanubhav.bletester.blemanagers.slate.SlateBleManager
import com.itsanubhav.bletester.blemanagers.tres.TresBleManager
import com.itsanubhav.bletester.config.Config
import javax.inject.Inject

class MyBleManager
@Inject constructor(context: Context,
                    tresBleManager: TresBleManager,
                    slateBleManager: SlateBleManager,
                    blazeBleManager: BlazeBleManager
) : BaseBleManager(context) {

    private val _tresBleManager = tresBleManager
    private val _slateBleManager = slateBleManager
    private val _blazeBleManager = blazeBleManager


    init {

    }

    fun connect(address: String, name: String){
        if (name.containsAnyOfIgnoreCase(Config.tresDeviceNameArray)){
            _tresBleManager.connect(address)
        }else if (name.containsAnyOfIgnoreCase(Config.slateDeviceNameArray)){
            _slateBleManager.connect(address)
        }else if (name.containsAnyOfIgnoreCase(Config.blazeDeviceNameArray)){
            _blazeBleManager.connect(address)
        }
    }

    fun fetchHeartRate(){

    }

    fun appSync(isFirstTimeSync: Boolean){
        _slateBleManager.appSync(isFirstTimeSync)
    }

    fun changeLanguage(){
        _tresBleManager.changeLanguage()
    }

    fun String.containsAnyOfIgnoreCase(keywords: Array<String>): Boolean {
        for (keyword in keywords) {
            if (this.contains(keyword, true)) return true
        }
        return false
    }

}