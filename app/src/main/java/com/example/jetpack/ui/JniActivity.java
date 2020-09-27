package com.example.jetpack.ui;

import android.os.Bundle;
import android.widget.TextView;
import com.example.jetpack.R;
import com.example.jetpack.base.BaseActivity;

public class JniActivity extends BaseActivity {

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_jni;
    }


    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        System.out.println("setContentView~~~~~~~~~~~~~");
    }

    @Override
    protected void initUI(Bundle savedInstanceState) {
        setToolBar(findViewById(R.id.toolbar),"JNI");
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }


    public native String stringFromJNI();
}