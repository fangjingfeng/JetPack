package com.example.jetpack.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.jetpack.ui.MVVMFragment;

import java.util.List;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/25
 * Time: 10:40
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private List<MVVMFragment> fragmentList;

    public MyPagerAdapter(@NonNull FragmentManager fm,List<MVVMFragment> fragmentList) {
        super(fm, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList==null?0:fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
