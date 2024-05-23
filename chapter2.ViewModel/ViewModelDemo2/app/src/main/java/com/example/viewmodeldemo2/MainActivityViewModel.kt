package com.example.viewmodeldemo2

import androidx.lifecycle.ViewModel

// 최초 viewmodel 실행시 인자를 입력받도록 재설계
class MainActivityViewModel(startingTotal: Int) : ViewModel() {
    private var total = 0

    init{
        total=startingTotal
    }

    fun getTotal():Int{
        return total
    }

    fun setTotal(input:Int){
        total +=input
    }
}