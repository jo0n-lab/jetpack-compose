package com.example.viewmodeldemo1

import androidx.lifecycle.ViewModel

class MainActivityViewmodel : ViewModel() {
    private var count = 0

    fun getCurrentCount():Int{
        return count
    }

    fun getUpdatedCount():Int{
        return ++count
    }
}