package com.example.android.kotlinproject1


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MyPetsViewModel : ViewModel(){

  private val pets = MutableLiveData<MutableList<MyPetsViewModel>>(mutableListOf())
    val pet: LiveData<MutableList<MyPetsViewModel>>
    get() = pets
}