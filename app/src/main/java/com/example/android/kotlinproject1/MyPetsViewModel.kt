package com.example.android.kotlinproject1


import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.android.kotlinproject1.models.Pet


class MyPetsViewModel : ViewModel() {

  // make the liveData object
val pets = MutableLiveData<MutableList<Pet>>(mutableListOf())


fun addPet(item: Pet?) {
  item?.let{
    pets.value?.add(item)
  }
}
}