package com.winmin.fragmentass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.winmin.fragmentass.model.Cloth
import com.winmin.fragmentass.model.ClotheAdapter

import com.winmin.fragmentass.model.ItemAdapter
import com.winmin.fragmentass.model.Thing
import kotlinx.android.synthetic.main.fragment_cloth.*
import kotlinx.android.synthetic.main.fragment_item.*

class ItemFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var clothlist = ArrayList<Thing>()
        clothlist.add(
            Thing("japan",R.drawable.japan1)
        )
        clothlist.add(
            Thing(
                "Korea",R.drawable.korea
            )
        )
        clothlist.add(
            Thing( "China",
                R.drawable.china1

            )
        )
        clothlist.add(
            Thing(
                "International",
                R.drawable.inter

            )
        )

        var clotheadapter = ItemAdapter(clothlist)

        itemRecycler.layoutManager =GridLayoutManager(context,2)
        itemRecycler.adapter = clotheadapter
    }

}
