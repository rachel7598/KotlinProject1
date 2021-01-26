package com.example.android.kotlinproject1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.android.kotlinproject1.databinding.FragmentLoginBinding
import com.example.android.kotlinproject1.databinding.FragmentWelcomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [WelcomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentWelcomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, container,false)
        binding.nextButton.setOnClickListener (
                Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_instructionsFragment))
        binding.skipButton.setOnClickListener (
                Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_myPetsFragment))
        return binding.root
    }

}