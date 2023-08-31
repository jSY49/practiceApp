package com.jaysdevapp.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaysdevapp.practiceapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.languageButton.setOnClickListener { buttonClick("Languages") }
        binding.webViewButton.setOnClickListener { buttonClick(("web-view")) }
        binding.dataBindingButton.setOnClickListener { buttonClick(("dataBinding")) }
        binding.viewModelDataButton.setOnClickListener { buttonClick(("viewModel")) }
    }

    private fun buttonClick(s: String) {
        lateinit var intent :Intent
        when(s){
            "Languages" -> {
              intent = Intent(this, LanguagesActivity::class.java)
              intent.putExtra("transResult",true)
            }
            "web-view"->{
                intent = Intent(this, WebviewActivity::class.java)
            }
            "dataBinding"->{
                intent = Intent(this, DataBindingActivity::class.java)
            }
            "viewModel"->{
                intent = Intent(this, viewModelActivity::class.java)
            }
          else -> {}
        }
        startActivity(intent)
    }
}