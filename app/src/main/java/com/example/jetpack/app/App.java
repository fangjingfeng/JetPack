package com.example.jetpack.app;

import androidx.multidex.MultiDexApplication;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/18
 * Time: 10:25
 */
public class App extends MultiDexApplication {

    private static App mAplication;

    public static App getInstance(){
        return mAplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mAplication = this;
    }
}
