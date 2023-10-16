package com.jaysdevapp.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.jaysdevapp.practiceapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.languageButton.setOnClickListener(this)
        binding.webViewButton.setOnClickListener(this)
        binding.dataBindingButton.setOnClickListener(this)
        binding.pipButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        lateinit var intent: Intent
        when (p0?.id) {
            R.id.language_button -> {
                intent = Intent(this, LanguagesActivity::class.java)
                intent.putExtra("transResult", true)
            }
            R.id.webView_button -> {
                intent = Intent(this, WebviewActivity::class.java)
            }
            R.id.dataBinding_button ->{
                intent = Intent(this, DataBindingActivity::class.java)
            }
            R.id.pip_button ->{
                intent = Intent(this, PipActivity::class.java)
            }
            else -> {}
        }
        startActivity(intent)
    }
}