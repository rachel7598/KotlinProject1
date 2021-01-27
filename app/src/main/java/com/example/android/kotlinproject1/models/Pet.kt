package com.example.android.kotlinproject1.models

import androidx.databinding.BaseObservable

data class Pet(
        var name: String="", var sex: String="", var dOB: String="", var mNo: String="", var favToy: String="", var favFood: String=""
) : BaseObservable()