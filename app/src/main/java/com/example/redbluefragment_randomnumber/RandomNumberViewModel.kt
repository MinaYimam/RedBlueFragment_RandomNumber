package com.example.redbluefragment_randomnumber

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomNumberViewModel: ViewModel() {
    val randomNumber = MutableLiveData(0)
    var showBlueFragment = false
}