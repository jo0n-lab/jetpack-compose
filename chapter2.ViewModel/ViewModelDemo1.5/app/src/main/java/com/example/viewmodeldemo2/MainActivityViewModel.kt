package com.example.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count=0
    private var editnum=""

    fun getCurrentNum():String{
        return editnum
    }

//    fun getUpdatedNum():String{
//        editnum=
//    }

    fun getCurrentCount():Int{
        return count
    }

    fun getUpdatedCount(num: String):String{
        count+=num.toInt()
        return count.toString()
    }

}