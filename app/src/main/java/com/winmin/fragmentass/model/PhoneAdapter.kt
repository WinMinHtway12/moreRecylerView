package com.winmin.fragmentass.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.winmin.fragmentass.R
import kotlinx.android.synthetic.main.cloth_collect.view.*

import kotlinx.android.synthetic.main.item_collect.view.*
import kotlinx.android.synthetic.main.item_collect.view.txtName
import kotlinx.android.synthetic.main.phone_item.view.*

class PhoneAdapter(var flowerlist: ArrayList<Phone>) :
    RecyclerView.Adapter<PhoneAdapter.FlowerViewHolder>() {
    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(flower: Phone) {
            itemView.txtPName.text = flower.name
            itemView.txtpBrand.text = flower.brand
            itemView.txtpprice.text=flower.price.toString()
        itemView.pimage.setBackgroundResource(flower.pho)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.phone_item, parent, false)
        return PhoneAdapter.FlowerViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(flowerlist[position])
    }

    override fun getItemCount(): Int = flowerlist.size
}