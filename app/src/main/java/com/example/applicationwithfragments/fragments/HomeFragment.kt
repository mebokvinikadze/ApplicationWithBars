package com.example.applicationwithfragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.applicationwithfragments.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var amountEditText: EditText
    private lateinit var sendButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        amountEditText = view.findViewById(R.id.carNumber)
        sendButton = view.findViewById(R.id.buttonSend)

        val navController = Navigation.findNavController(view)

        sendButton.setOnClickListener {

            val amountText = amountEditText.text.toString()

            if (amountText.isEmpty()) {
                return@setOnClickListener
            }

            val amount = amountText.toString()

            val action = HomeFragmentDirections.actionHomeFragmentToCarFragment(amount)

            navController.navigate(action)

        }

    }

}