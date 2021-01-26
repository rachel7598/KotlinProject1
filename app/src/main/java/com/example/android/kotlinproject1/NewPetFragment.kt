package com.example.android.kotlinproject1

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.android.kotlinproject1.databinding.FragmentNewPetBinding
import kotlinx.android.synthetic.main.fragment_my_pets.*
import kotlinx.android.synthetic.main.fragment_new_pet.*

class NewPetFragment : Fragment() {

    private var model: MyPetsViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // inflate the layout and obtain an instance of the binding class
        val binding: FragmentNewPetBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_new_pet, container, false)

        // set a click listener on the save button to navigate to the My Pets Fragment
        binding.saveButton.setOnClickListener(
                Navigation.createNavigateOnClickListener (R.id.action_newPetFragment_to_myPetsFragment))
// set a click listener on the cancel button to navigate to the My Pets Fragment
        binding.cancelButton.setOnClickListener(
                Navigation.createNavigateOnClickListener (R.id.action_newPetFragment_to_myPetsFragment))

        return binding.root


}}

