package com.example.viewmodeldemo2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel:MainActivityViewModel
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel= ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.countText.text=viewModel.getCurrentCount().toString()
        binding.countButton.setOnClickListener(){
            binding.countText.text=viewModel.getUpdatedCount(binding.countEditText.text.toString())
        }


    }
}