package com.example.jetpack.ui;

import android.os.Bundle;
import android.view.View;
import com.example.jetpack.R;
import com.example.jetpack.bean.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initUI(Bundle savedInstanceState) {
        setToolBar(findViewById(R.id.toolbar),"主页",false);
    }



    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {}


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_jni:
                startActivity(JniActivity.class);
                break;
            case R.id.btn_mvvm:
                //ToastUtils.show("dsfdsfsdf");
                startActivity(MvvmActivity.class);
                break;
        }
    }
}
