package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    private var URL="https://openweathermap.org"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView=findViewById(R.id.webView)
        webView.apply {
            loadUrl(URL)
            settings.javaScriptEnabled=true
            webViewClient= WebViewClient()
        }
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) webView.goBack()
        else super.onBackPressed()
    }
}