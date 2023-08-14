package com.jaysdevapp.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.jaysdevapp.practiceapp.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {

    lateinit var binding : ActivityDataBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_data_binding)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding)
        var tmp=0
        binding.changeBtn.setOnClickListener {
            binding.profile=Profile(tmp++)
//            binding.invalidateAll()
        }
        binding.finishButton.setOnClickListener { finish() }
    }

}