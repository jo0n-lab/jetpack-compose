package com.example.viewmodeldemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private var count = 0
    // ViewModel 인스턴스 생성
    private lateinit var viewModel : MainActivityViewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainActivityViewmodel::class.java)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.button.setOnClickListener {
//            count++
//            binding.countText.text = count.toString()
            binding.countText.text=viewModel.getUpdatedCount().toString()
        }
    }
}