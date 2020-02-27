package com.netease.neteasedisc;

import android.app.Application;

import com.performance.analysis.DoraemonKit;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DoraemonKit.install(this);
    }
}
