package com.example.viewmodeldemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {

    //일반적으로는 private 으로 선언되어 접근할 수 없으므로
    //total 의 alias 격인 totalData 를 val 으로 생성한다
    //따라서 접근할 수 있으며, 변경이 불가능하므로 나름 안전한 셈이다.
    private var total = MutableLiveData<Int>()
    val totalData: LiveData<Int>
        get() = total

    init {
        total.value = startingTotal
    }

    fun setTotal(input: Int) {
        total.value = (total.value)?.plus(input)
    }
}