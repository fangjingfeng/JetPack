package com.example.jetpack.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/24
 * Time: 10:31
 */
public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return setContentLayout(inflater,container);
    }

    protected View setContentLayout(@NonNull LayoutInflater inflater, @Nullable ViewGroup container){
        return inflater.inflate(getLayoutId(),container);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initUI(savedInstanceState);

        initData();
    }

    protected abstract @LayoutRes int getLayoutId();

    protected abstract void initUI(Bundle savedInstanceState);

    protected abstract void initData();
}
