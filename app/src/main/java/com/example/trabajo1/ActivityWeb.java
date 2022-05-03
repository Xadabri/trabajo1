package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {
    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wv1=(WebView) findViewById(R.id.txt_web);
        //recuperar valores por el internet
        String URL=getIntent().getStringExtra("SitioWeb");
        //permitira el user navegar solo en el app
        wv1.setWebViewClient(new WebViewClient());
        //abrira el sitip web que solicito
        wv1.loadUrl("http://www."+URL);
    }
}
