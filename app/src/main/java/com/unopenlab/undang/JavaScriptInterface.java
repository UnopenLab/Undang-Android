package com.unopenlab.undang;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Jungin on 2018. 1. 6..
 */

public class JavaScriptInterface {
    private Activity activity;

    public JavaScriptInterface(Activity activiy) {
        this.activity = activiy;
    }

    public void shareTemperature(){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String currentTime = "currentTime";
        String currentTemp = "currentTemp";
        intent.putExtra(Intent.EXTRA_SUBJECT, currentTime);
        intent.putExtra(Intent.EXTRA_TEXT, currentTemp);
        activity.startActivity(Intent.createChooser(intent,"Share Temperature"));

    }
}
