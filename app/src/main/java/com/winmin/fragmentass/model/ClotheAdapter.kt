package com.winmin.fragmentass.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.winmin.fragmentass.R
import kotlinx.android.synthetic.main.cloth_collect.view.*


class ClotheAdapter(var flowerlist: ArrayList<Cloth>) :
    RecyclerView.Adapter<ClotheAdapter.FlowerViewHolder>() {
    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(flower: Cloth) {
            itemView.txtName.text=flower.name
            itemView.txtprice.text = flower.price.toString()
            itemView.txtbrand.text=flower.brand
            itemView.cloth.setImageResource(flower.image)

        }
    }
    override fun getItemCount(): Int = flowerlist.size

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(flowerlist[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cloth_collect, parent, false)
        return FlowerViewHolder(view)
    }

}