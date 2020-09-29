package com.winmin.fragmentass.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.winmin.fragmentass.R
import kotlinx.android.synthetic.main.cloth_collect.view.*
import kotlinx.android.synthetic.main.cloth_collect.view.txtName
import kotlinx.android.synthetic.main.item_collect.view.*


class ItemAdapter(var flowerlist: ArrayList<Thing>) :
    RecyclerView.Adapter<ItemAdapter.FlowerViewHolder>() {
    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(flower: Thing) {
            itemView.txtName.text = flower.name

            itemView.image.setBackgroundResource(flower.pho)


        }
    }

    override fun getItemCount(): Int = flowerlist.size

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(flowerlist[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_collect, parent, false)
        return FlowerViewHolder(view)
    }

}
