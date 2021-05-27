package com.ariqandrean.myapplication190421.ram

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ariqandrean.myapplication190421.MainActivity
import com.ariqandrean.myapplication190421.OrderActivity
import com.ariqandrean.myapplication190421.R
import kotlinx.android.synthetic.main.ram_layout.view.*

class OrderRamAdapter (
    val arrayList: ArrayList<OrderRamData>,
    val context: Context
) : RecyclerView.Adapter<OrderRamAdapter.ViewHolder>(){

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(model : OrderRamData){
            itemView.imageRam.setImageResource(model.imgRam)
            itemView.NamaMerkRam.text = model.NmMerkRam
            itemView.descRam.text = model.descRam
            itemView.hargaRam.text = model.HrgRam.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.ram_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return  arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener(){
            val model = arrayList.get(position)

            var gImg : Int = model.imgRam
            var gNmMerkRam : String = model.NmMerkRam
            var gDescRam : String = model.descRam
            var gHrgRam : Int = model.HrgRam.toString().toInt()

            val intent = Intent(context, OrderActivity::class.java)
            intent.putExtra("iImg", gImg)
            intent.putExtra("iNmMerkRam", gNmMerkRam)
            intent.putExtra("iDescRam", gDescRam)
            intent.putExtra("iHrgRam", gHrgRam)
            context.startActivities(arrayOf(intent))

        }
    }

}