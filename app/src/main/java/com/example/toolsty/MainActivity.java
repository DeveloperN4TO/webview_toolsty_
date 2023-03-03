package com.example.toolsty;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webtoolsty = findViewById(R.id.webviewtoolsty);
        WebSettings webSettings = webtoolsty.getSettings();

        webtoolsty.setWebViewClient(new WebViewClient());
        webtoolsty.getSettings().setJavaScriptEnabled(true);
        webtoolsty.getSettings().setDomStorageEnabled(true);
        webSettings = webtoolsty.getSettings();
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webtoolsty.getSettings().setUseWideViewPort(true);
        webtoolsty.getSettings().setLoadWithOverviewMode(true);
        webtoolsty.getSettings().setBuiltInZoomControls(true);
        webtoolsty.getSettings().setDisplayZoomControls(false);
        webtoolsty.getSettings().setSupportZoom(true);
        webtoolsty.getSettings().setNeedInitialFocus(true);


        webtoolsty.loadUrl("https://toolsty.com.br/");



    }
}