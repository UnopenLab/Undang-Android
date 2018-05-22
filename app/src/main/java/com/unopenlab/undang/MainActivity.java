package com.unopenlab.undang;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

import com.unopenlab.undang.clientlibrary.Core.ServerInfoManager;
import com.unopenlab.undang.clientlibrary.Core.WebAppInterface;
import com.unopenlab.undang.clientlibrary.Exceptions.ServerInfoManagerException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private WebView mMainWebView;
    private static final String MAIN_URL = "https://undang.twpower.me/";

    @SuppressLint("JavascriptInterface")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServerInfoManager.getInstance().init(MAIN_URL);

        mMainWebView = findViewById(R.id.wv_main);

        WebAppInterface jsInterface = new WebAppInterface(this);
        mMainWebView.getSettings().setJavaScriptEnabled(true);
        mMainWebView.addJavascriptInterface(jsInterface, "JSInterface");
        try {
            mMainWebView.loadUrl(ServerInfoManager.getInstance().getBaseUrl());
        } catch(ServerInfoManagerException e) {
            Log.e(TAG, "onCreate: " + e.getMessage());
            // TODO: 2018. 5. 22. Error 처리
        }
    }

    @Override
    public void onBackPressed() {
        if (mMainWebView.canGoBack()) {
            mMainWebView.goBack();
        } else {
            finish();
        }
    }
}
