package com.example.jetpack.ui;

import android.os.Bundle;
import android.view.View;
import com.example.jetpack.BuildConfig;
import com.example.jetpack.R;
import com.example.jetpack.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initUI(Bundle savedInstanceState) {
        setToolBar(findViewById(R.id.toolbar),"主页"+ BuildConfig.BUILD_TYPE,false);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {}


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_autograph:
                startActivity(SigningActivity.class);
                break;
            case R.id.btn_jni:
                startActivity(JniActivity.class);
                break;
            case R.id.btn_mvvm:
                //ToastUtils.show("dsfdsfsdf");
                startActivity(MvvmActivity.class);
                break;
            case R.id.btn_tab:
                startActivity(TabFragmentActivity.class);
                break;
        }
    }
}
