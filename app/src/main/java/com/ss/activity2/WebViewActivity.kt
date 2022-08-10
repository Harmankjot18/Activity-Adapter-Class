package com.ss.activity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ss.activity2.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    lateinit var binding1: ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding1 = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding1.root)
        binding1.web1.loadUrl("https://google.com")
        binding1.web1.settings.javaScriptEnabled = true
    }

    override fun onBackPressed() {
        if (binding1.web1.canGoBack()) {
            binding1.web1.goBack()
        } else {
            super.onBackPressed()
        }
    }
}