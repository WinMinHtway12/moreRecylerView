package com.winmin.fragmentass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.winmin.fragmentass.model.Phone
import com.winmin.fragmentass.model.PhoneAdapter

import kotlinx.android.synthetic.main.fragment_phone.*

class PhoneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    var clothlist = ArrayList<Phone>()
        clothlist.add(
           Phone("I PhoneX","Apple",1000000,R.drawable.ix)
        )
        clothlist.add(
            Phone("I Phone11","Apple",13000000,R.drawable.i11pro)
        )
        clothlist.add(
            Phone("T-Shirt","Gucci",100000,R.drawable.gucci)
        )


        clothlist.add(
            Phone("BackPack","Gucci",100000,R.drawable.lvback)
        )

        var clotheadapter = PhoneAdapter(clothlist)

        phoneRecycler.layoutManager = LinearLayoutManager( context,
            LinearLayoutManager.VERTICAL, false)
        phoneRecycler.adapter = clotheadapter
    }


}