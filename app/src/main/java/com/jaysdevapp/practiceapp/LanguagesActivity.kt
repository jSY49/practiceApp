package com.jaysdevapp.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaysdevapp.practiceapp.databinding.ActivityLanguagesBinding

class LanguagesActivity : AppCompatActivity() {

    val binding by lazy { ActivityLanguagesBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val res = intent.getBooleanExtra("transResult",false)
        binding.resTextview.text= res.toString()
        binding.finishButton.setOnClickListener { finish() }
    }
}