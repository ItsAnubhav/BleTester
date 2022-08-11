package com.itsanubhav.bletester

import android.bluetooth.BluetoothDevice
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.itsanubhav.bletester.config.Config
import com.itsanubhav.bletester.databinding.ActivityScannerBinding
import com.itsanubhav.bletester.ui.scanner.ScannerRVAdapter
import dagger.hilt.android.AndroidEntryPoint
import no.nordicsemi.android.support.v18.scanner.*
import kotlin.collections.ArrayList

@AndroidEntryPoint
class ScannerActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityScannerBinding

    private lateinit var scannerAdapter : ScannerRVAdapter

    var isScanning = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScannerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener {
            if (isScanning) {
                stopScan()
                binding.fab.setText("Start Scan")
            }else {
                startScan()
                binding.fab.setText("Stop Scan")
            }
        }

        scannerAdapter = ScannerRVAdapter(applicationContext)
        binding.scanRecyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        binding.scanRecyclerView.adapter = scannerAdapter
        startScan()
    }


    override fun onDestroy() {
        super.onDestroy()
        stopScan()
    }

    override fun onPause() {
        super.onPause()
        stopScan()
    }

    fun startScan(){
        val scanner = BluetoothLeScannerCompat.getScanner()
        val settings: ScanSettings = ScanSettings.Builder()
            .setLegacy(false)
            .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
            .setReportDelay(5000)
            .setUseHardwareBatchingIfSupported(true)
            .build()
        val filters: MutableList<ScanFilter> = ArrayList()
        //Add different Device name filter here

        scanner.startScan(filters, settings, mScanCallback)
        isScanning = true
    }

    private fun checkSupportedDeviceName(deviceName : String?) : Boolean{
        if (deviceName!=null){
            for (name in Config.supportedDeviceNames)
                return deviceName.contains(name,true)
            return false
        }else{
            return false
        }
    }

    private val mScanCallback: ScanCallback = object : ScanCallback() {

        override fun onScanResult(callbackType: Int, result: ScanResult) {
            println("BLE// onScanResult")
            val btDevice: BluetoothDevice = result.device
            scannerAdapter.addDevice(btDevice.address,result.scanRecord?.deviceName ?: "" )
        }

        override fun onBatchScanResults(results: List<ScanResult?>) {
            println("BLE// onBatchScanResults")
            for (sr in results) {
                Log.i("ScanResult - Results", sr.toString())
                val btDevice: BluetoothDevice? = sr?.device
                if (btDevice!=null && sr.scanRecord?.deviceName!=null) {
                    scannerAdapter.addDevice(btDevice.address,sr.scanRecord?.deviceName ?: "" )
                }
            }
        }

        override fun onScanFailed(errorCode: Int) {
            println("BLE// onScanFailed")
            Log.e("Scan Failed", "Error Code: $errorCode")
            Toast.makeText(applicationContext,"Scan Failed : $errorCode",Toast.LENGTH_SHORT).show()
        }
    }

    fun stopScan(){
        val scanner = BluetoothLeScannerCompat.getScanner()
        scanner.stopScan(mScanCallback)
        isScanning = false
    }

}