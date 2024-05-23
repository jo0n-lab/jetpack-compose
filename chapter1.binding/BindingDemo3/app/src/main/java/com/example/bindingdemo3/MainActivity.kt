package com.example.bindingdemo3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bindingdemo3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.student=getStudent()
//        val student =getStudent()
//        binding.nameText.text = student.name
//        binding.emailText.text = student.email
        // xml 에 정의된 text 에 그대로 바인딩되어 있음.
        // xml 에 정의하면, .java 혹은 .kt 에서 binding 객체 가져올 수 있음
    }

    private fun getStudent():Student{
        return Student(1,"Alex","alex@gmail.com")
    }
}