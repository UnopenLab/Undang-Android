package com.unopenlab.undang;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mMainWebView;
    private static final String MAIN_URL = "http://182.162.104.151:6231";
  //  private static final String MAIN_URL = "http://htmlpreview.github.com/?https://github.com/jungining/Undang-Web/blob/develop/index.html";

    @SuppressLint("JavascriptInterface")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mMainWebView = (WebView) findViewById(R.id.wv_main);

        JavaScriptInterface jsInterface = new JavaScriptInterface(this);
        mMainWebView.getSettings().setJavaScriptEnabled(true);
        mMainWebView.addJavascriptInterface(jsInterface, "JSInterface");

        mMainWebView.loadUrl(MAIN_URL);


    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
