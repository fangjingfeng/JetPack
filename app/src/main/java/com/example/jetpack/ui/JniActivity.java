package com.example.jetpack.ui;

import android.widget.TextView;
import com.example.jetpack.R;
import com.example.jetpack.bean.BaseActivity;

public class JniActivity extends BaseActivity {

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_jni;
    }

    @Override
    protected void initUI() {
        setToolBar(findViewById(R.id.toolbar),"JNI");
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    @Override
    protected void initData() {

    }


    public native String stringFromJNI();
}