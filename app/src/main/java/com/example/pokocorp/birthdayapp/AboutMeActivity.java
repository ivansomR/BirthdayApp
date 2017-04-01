package com.example.pokocorp.birthdayapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        WebView aboutme = (WebView) findViewById(R.id.about_me);
        aboutme.setWebViewClient(new WebViewClient());

        aboutme.loadUrl("http://www.IvanSomarriba.com");

    }
}
