package com.unopenlab.undang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mMainWebView;
    private static final String MAIN_URL = "https://raw.githubusercontent.com/UnopenLab/Undang-Web/master/index.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainWebView = (WebView) findViewById(R.id.wv_main);
        mMainWebView.loadUrl(MAIN_URL);
    }
}
