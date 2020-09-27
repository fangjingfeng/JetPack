package com.example.jetpack.base;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/27
 * Time: 14:31
 */
public abstract class BasePagerAdapter<T extends Fragment> extends FragmentStatePagerAdapter {
    private List<T> mData;

    public BasePagerAdapter(@NonNull FragmentManager fm, int behavior,List<T> data) {
        super(fm, behavior);
        mData = data;
    }

    @Override
    public int getCount() {
        return mData==null?0:mData.size();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mData == null?null:mData.get(position);
    }

    protected List<T> getData(){
        return mData;
    }

    protected T getDataPosition(int position){
        return mData.get(position);
    }
}
