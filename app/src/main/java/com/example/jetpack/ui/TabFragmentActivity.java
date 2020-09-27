package com.example.jetpack.ui;

import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;
import com.example.jetpack.R;
import com.example.jetpack.adapter.MyPagerAdapter;
import com.example.jetpack.base.BaseActivity;
import com.example.jetpack.model.bean.TabItemData;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

public class TabFragmentActivity extends BaseActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewpager;
    private List<MVVMFragment> mPageFragements;
    private List<TabItemData> mTabData;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_tab_fragment;
    }

    @Override
    protected void initUI(Bundle savedInstanceState) {
        setToolBar(findViewById(R.id.toolbar),"Tab-Fragment");
        mTabLayout = findViewById(R.id.tab_layout);
        mViewpager = findViewById(R.id.viewpager);
    }

    @Override

    protected void initListener() {

    }

    @Override
    protected void initData() {
        mPageFragements = new ArrayList();
        mTabData = new ArrayList<>();

        for(int i = 0;i<10;i++){
            MVVMFragment fragment = new MVVMFragment();
            mPageFragements.add(fragment);
            mTabData.add(initItem(i));
        }
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),mPageFragements);
        mViewpager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mViewpager);

    }

    public TabItemData initItem(int type){
        return new TabItemData("",type,null);
    }
}