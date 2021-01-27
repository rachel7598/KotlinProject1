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
import com.example.android.kotlinproject1.models.Pet


class NewPetFragment : Fragment() {
    // instantiate the MyPetsViewModel
    private val myPetsViewModel : MyPetsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // inflate the layout and obtain an instance of the binding class
        val binding: FragmentNewPetBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_new_pet, container, false)

        binding.myPetsViewModel= myPetsViewModel
        binding.pet= Pet("","","","","","")

        //set a click listener on the save button to navigate to the My Pets Fragment
        binding.saveButton.setOnClickListener(
              Navigation.createNavigateOnClickListener (R.id.action_newPetFragment_to_myPetsFragment))


// set a click listener on the cancel button to navigate to the My Pets Fragment
        binding.cancelButton.setOnClickListener(
                Navigation.createNavigateOnClickListener (R.id.action_newPetFragment_to_myPetsFragment))

        return binding.root


}}

