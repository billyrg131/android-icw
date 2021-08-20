package com.example.intentcalcwebview

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_intent.*
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webActivitySetup()

        btn_menu2.setOnClickListener {
            val menuLnk1 = Intent(this, MainActivity::class.java)
            startActivity(menuLnk1)
        }
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webActivitySetup() {
        webView.webViewClient = WebViewClient()
        webView.apply{
            loadUrl("https://www.youtube.com")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }
    override fun onBackPressed() {
        if (webView.canGoBack())webView.goBack()else super.onBackPressed()
    }
}