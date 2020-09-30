package com.example.jetpack.ui;

import android.os.Bundle;
import com.example.jetpack.R;
import com.example.jetpack.base.BaseActivity;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/28
 * Time: 18:26
 */
public class WelcomeActivity extends BaseActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void initUI(Bundle savedInstanceState) {
        String classLodader = getClassLoader().toString();
        System.out.println("classLodader - "+classLodader);
    }

    @Override
    protected void initListener() {

    }W

    @Override
    protected void initData() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        //startActivity(new Intent(this,MainActivity.class));

        //finish();
    }
}
