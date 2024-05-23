package com.example.viewmodeldemo2

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//ViewModel 생성(construct) 시, 옵션을 주는 ViewModel Constructor 라고 생각하면 단순
//https://readystory.tistory.com/176 참조
class MainActivityViewModelFactory(private val startingTotal:Int) :ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}