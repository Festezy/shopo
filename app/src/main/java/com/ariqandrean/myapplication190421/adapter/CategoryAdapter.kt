package com.ariqandrean.myapplication190421.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ariqandrean.myapplication190421.model.CategoryModel
import com.ariqandrean.myapplication190421.R
import kotlinx.android.synthetic.main.caregories_item.view.*

class CategoryAdapter(val context: Context, val dataList: ArrayList<CategoryModel>?)
    : RecyclerView.Adapter<CategoryAdapter.MyViewHolder>() {
    class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val tvName = view.tvName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.caregories_item, parent, false)

        )
    }

    override fun getItemCount(): Int {
        return dataList!!.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataList!![position]

        holder.tvName.text = item?.name.toString()
    }
}