package com.example.jetpack.ui;

import android.os.Bundle;
import com.example.jetpack.R;
import com.example.jetpack.base.BaseMVVMActivity;
import com.example.jetpack.databinding.ActivityMvvmBindingImpl;
import com.example.jetpack.vm.MyViewModel;

public class MvvmActivity extends BaseMVVMActivity<MyViewModel, ActivityMvvmBindingImpl> {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_mvvm;
    }

    @Override
    protected void initUI(Bundle savedInstanceState) {
        setToolBar(dataBinding.toolbar,"MVVM");
    }

    @Override
    protected void initData() {
        dataBinding.setVm(mViewModel);
    }
}