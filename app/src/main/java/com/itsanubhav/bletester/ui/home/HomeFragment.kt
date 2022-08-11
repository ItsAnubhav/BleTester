package com.itsanubhav.bletester.ui.home

import android.bluetooth.BluetoothDevice
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.itsanubhav.bletester.databinding.FragmentHomeBinding
import com.itsanubhav.bletester.events.ConnectionStateEvent
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode


@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private var sharedPreferences : SharedPreferences? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var device : BluetoothDevice? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        sharedPreferences = context?.getSharedPreferences("MySharedPref",
            AppCompatActivity.MODE_PRIVATE
        )

        val root: View = binding.root

        val deviceName = sharedPreferences?.getString("deviceName","")
        val deviceMac = sharedPreferences?.getString("deviceAddress","")

        binding.deviceNameTv.text = deviceName
        binding.deviceMacTv.text = deviceMac
        homeViewModel.initialize(deviceMac!!)
        binding.connectBtn.setOnClickListener {
            if (deviceMac!=null && deviceName!=null) {
                if (binding.connectBtn.text == "Connect")
                    homeViewModel.connectDevice(deviceMac, deviceName)
                else
                    homeViewModel.disconnectDevice(deviceMac, deviceName)
            }else{
                Toast.makeText(context,"Invalid device address/name",Toast.LENGTH_SHORT).show()
            }
        }

        binding.sync.setOnClickListener {
            homeViewModel.syncDevice()
        }

        binding.hrBtn.setOnClickListener {
            homeViewModel.fetchHr()
        }

        binding.language.setOnClickListener {
            homeViewModel.changeLanguage()
        }

        binding.isConnected.setOnClickListener {
            val flag = homeViewModel.isConnected()
            if (flag){
                Toast.makeText(context,"Device is connected",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(context,"Device is not connected",Toast.LENGTH_SHORT).show()
            }
        }

        return root
    }

    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun connectionStateChangeEvent(event : ConnectionStateEvent){
        if (event.newState == 2){
            //device connected
            device = null
            binding.connectBtn.text = "Disconnect"
        }else if (event.newState == 0){
            //device disconnected
            device = event.device
            binding.connectBtn.text = "Connect"
        }
    }
}