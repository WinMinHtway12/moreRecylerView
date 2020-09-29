package com.winmin.fragmentass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.winmin.fragmentass.model.Cloth
import com.winmin.fragmentass.model.ClotheAdapter
import kotlinx.android.synthetic.main.fragment_cloth.*


class ClothFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cloth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var clothlist = ArrayList<Cloth>()
        clothlist.add(
                Cloth(
                    R.drawable.lv2,
                    "Hyde Park N41015", 100000000,
                    "LOUIS VUITTON",
                )
                )

        clothlist.add(
            Cloth(
                R.drawable.lv1,
                "Hyde Park N41015", 100000000,
                "LOUIS VUITTON",
            )
        )
        clothlist.add(
            Cloth(
                R.drawable.supmere,
                "Shirt", 1000000,
                "Superme",
            )
        )
        clothlist.add(
            Cloth(
                R.drawable.sp2,
                "Backpack", 1000000,
                "Superme",
            )
        )

        var clotheadapter = ClotheAdapter(clothlist)

        clothRecycler.layoutManager = LinearLayoutManager(
            context, LinearLayoutManager.HORIZONTAL, false
        )
        clothRecycler.adapter = clotheadapter
    }


}