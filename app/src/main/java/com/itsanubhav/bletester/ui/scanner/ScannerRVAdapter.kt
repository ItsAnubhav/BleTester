package com.itsanubhav.bletester.ui.scanner

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.content.SharedPreferences
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.itsanubhav.bletester.MainActivity
import com.itsanubhav.bletester.R


class ScannerRVAdapter(
    context : Context,
): RecyclerView.Adapter<ScannerRVAdapter.MyViewHolder>() {

    var mContext: Context
    val deviceAddressList = mutableListOf<String>()
    val deviceNameList = mutableListOf<String>()

    init {
        this.mContext = context
    }

    fun addDevice(device: String, name: String){
        if (!deviceAddressList.contains(device)) {
            deviceAddressList.add(device)
            deviceNameList.add(name)
            Log.d("ScannedDevice", "Device: $name $device")
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.scan_device_item_layout,parent,false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.deviceName.text = deviceNameList[holder.adapterPosition]
        holder.deviceMac.text = deviceAddressList[holder.adapterPosition]
        holder.itemView.setOnClickListener(object : View.OnClickListener{
            override fun onClick(view: View?) {
                val sharedPreferences: SharedPreferences =
                    mContext.getSharedPreferences("MySharedPref", MODE_PRIVATE)
                val editor = sharedPreferences.edit();
                editor.putString("deviceAddress",deviceAddressList[holder.adapterPosition])
                editor.putString("deviceName",deviceNameList[holder.adapterPosition])
                editor.apply()

                val intent = Intent(mContext,MainActivity::class.java)
                intent.addFlags(FLAG_ACTIVITY_NEW_TASK)
                mContext.startActivity(intent)
            }
        })
    }

    override fun getItemCount(): Int {
        return deviceAddressList.size ?: 0
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var deviceName : TextView
        var deviceMac : TextView

        init {
            deviceName = itemView.findViewById(R.id.deviceName)
            deviceMac = itemView.findViewById(R.id.deviceMac)
        }

    }


}