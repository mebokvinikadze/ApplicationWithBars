package com.example.applicationwithfragments.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.applicationwithfragments.R

class CarFragment: Fragment(R.layout.fragment_car) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.mankanisNomeri).text =
            CarFragmentArgs.fromBundle(requireArguments()).carnumber.toString()
    }
}