package com.itsanubhav.bletester

import android.bluetooth.BluetoothDevice
import android.os.Bundle
import android.os.Handler
import android.os.ParcelUuid
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.itsanubhav.bletester.databinding.ActivityScannerBinding
import com.itsanubhav.bletester.ui.scanner.ScannerRVAdapter
import no.nordicsemi.android.support.v18.scanner.*
import java.util.*
import kotlin.collections.ArrayList


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
//        filters.add(ScanFilter.Builder().setDeviceName("HT5").build())
//        filters.add(ScanFilter.Builder().setServiceUuid(ParcelUuid(UUID.fromString("0000f618-0000-1000-8000-00805f9b34fb"))).build())
//        filters.add(ScanFilter.Builder().set)
        scanner.startScan(filters, settings, mScanCallback)
        isScanning = true
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