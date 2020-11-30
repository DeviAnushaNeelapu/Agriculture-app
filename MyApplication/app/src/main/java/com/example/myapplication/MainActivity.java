package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView button,fb,javatpoint;
    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);

        button = (ImageView) findViewById(R.id.buttonUrl);
        fb = (ImageView) findViewById(R.id.buttonUrl1);
        javatpoint=(ImageView)findViewById(R.id.buttonUrl2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,MainActivity.class);
                startActivity(i);
                    webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("http://agricoop.nic.in/");
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,MainActivity.class);
                startActivity(i);
                 webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("http://pmkisan.ap.gov.in/PMKISANAPP/kisan/index");
            }
        });
        javatpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent (context,MainActivity.class);
                startActivity(i);
                webView.loadUrl("http://www.javatpoint.com");
            }
        });
    }


}