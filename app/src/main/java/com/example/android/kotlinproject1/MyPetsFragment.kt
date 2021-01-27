package com.example.android.kotlinproject1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.example.android.kotlinproject1.databinding.FragmentMyPetsBinding
import com.example.android.kotlinproject1.databinding.PetItemBinding
import com.example.android.kotlinproject1.models.Pet
import com.example.android.kotlinproject1.MyPetsViewModel
import androidx.fragment.app.activityViewModels


class MyPetsFragment : Fragment() {
    // instantiate this  MyPetsViewModel
    private val myPetsViewModel: MyPetsViewModel by activityViewModels()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // inflate layout
        val binding: FragmentMyPetsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_pets, container,false)
binding.lifecycleOwner=this

        myPetsViewModel.petList.observe(viewLifecycleOwner, Observer{

            for(pet in it){
                DataBindingUtil.inflate<PetItemBinding>( layoutInflater,R.layout.pet_item,binding.petListLayout, true).
                apply{
                    this.pet = pet}
                }})

        binding.newPetButton.setOnClickListener (
           Navigation.createNavigateOnClickListener(R.id.action_myPetsFragment_to_newPetFragment))

        return binding.root
            }}



