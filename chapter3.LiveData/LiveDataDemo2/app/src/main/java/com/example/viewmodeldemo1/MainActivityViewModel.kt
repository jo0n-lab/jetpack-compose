package com.example.viewmodeldemo1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = MutableLiveData<Int>(0)
    val totalCount: LiveData<Int> get()=count

    init{ // MutableLiveData 는 nullable(?) 이므로 초기화를 해주어야!
        count.value=0
    }

    fun plusCount(){
        count.value=(count.value)?.plus(1)
    }

}