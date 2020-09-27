package com.example.jetpack.ui;

import android.os.Bundle;
import com.example.jetpack.R;
import com.example.jetpack.base.BaseMVVMFragment;
import com.example.jetpack.databinding.FragmentMvvmLayoutBinding;
import com.example.jetpack.utils.LogUtil;
import com.example.jetpack.vm.FragmentViewModel;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/24
 * Time: 14:56
 */
public class MVVMFragment extends BaseMVVMFragment<FragmentViewModel, FragmentMvvmLayoutBinding> {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mvvm_layout;
    }

    @Override
    protected void initUI(Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        dataBinding.setData(mViewModel);
        LogUtil.d("mViewModel.mTableItemData.name= "+mViewModel.mTableItemData.getValue());
    }
}
