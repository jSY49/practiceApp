package com.jaysdevapp.practiceapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import com.jaysdevapp.practiceapp.databinding.ActivityWebviewBinding

class WebviewActivity : AppCompatActivity() {
    private val binding by lazy { ActivityWebviewBinding.inflate(layoutInflater) }
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.webView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
        /*
        binding.webView.settings.javaScriptEnabled = true   //자바스크립트 허용
        binding.webView.webChromeClient = WebChromeClient() //웹뷰에서 크롬 사용 가능하도록
        */
        binding.webView.loadUrl("file:///android_asset/test1.html")
    }
}