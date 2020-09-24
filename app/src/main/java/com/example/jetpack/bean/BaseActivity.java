package com.example.jetpack.bean;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/18
 * Time: 10:36
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected Activity mActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayoutId();
        mActivity = this;

        initUI(savedInstanceState);
        initListener();
        initData();
    }

    protected void setLayoutId(){
        setContentView(getLayoutId());
    }

    protected abstract int getLayoutId();

    protected abstract void initUI(Bundle savedInstanceState);

    protected abstract void initListener();

    protected abstract void initData();

    protected void setToolBar(Toolbar toolbar, String title) {
        setToolBar(toolbar,title,true);
    }

    protected void setToolBar(Toolbar toolbar, String title,boolean isBackShow) {
        if(toolbar == null)return;
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        TextView titleView = (TextView) toolbar.getChildAt(0);
        if(titleView!=null){
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.MATCH_PARENT);
            params.gravity = Gravity.CENTER;
            titleView.setLayoutParams(params);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(isBackShow);//给左上角添加上一个返回的图标
        getSupportActionBar().setDisplayShowHomeEnabled(isBackShow);//使左上角图标是否显示，如果设成false，则没有程序图标，仅仅就个标题
        toolbar.setNavigationOnClickListener(view -> onBackPressedSupport());
    }

    protected void onBackPressedSupport(){
        finish();
    }


    protected void startActivity(Class  clazz){
        startActivity(new Intent(mActivity,clazz));
    }

}
