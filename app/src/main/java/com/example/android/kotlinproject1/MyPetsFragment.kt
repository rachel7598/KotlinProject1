package com.example.android.kotlinproject1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.android.kotlinproject1.databinding.FragmentMyPetsBinding
import kotlinx.android.synthetic.main.fragment_new_pet.*


class MyPetsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentMyPetsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_pets, container,false)

        binding.newPetButton.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_myPetsFragment_to_newPetFragment))

        return binding.root
            }

    }

