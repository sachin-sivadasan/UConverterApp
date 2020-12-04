package com.utils.converter.app;

import android.app.Application;
import android.util.Log;

public class MainApplication extends Application {

    private String TAG = "MainApplication.class";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "main application onCreate()");
    }
}