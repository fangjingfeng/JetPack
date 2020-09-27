package com.example.jetpack.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.jetpack.app.App;
import com.example.jetpack.utils.TUtil;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/24
 * Time: 14:37
 */
public abstract class BaseMVVMFragment<VM extends ViewModel, VDb extends ViewDataBinding> extends BaseFragment {

    protected VM mViewModel;
    protected VDb dataBinding;

    @Override
    protected View setContentLayout(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        dataBinding = DataBindingUtil.inflate(inflater,getLayoutId(),container,false);
        dataBinding.setLifecycleOwner(this);
//        Class<VM> vmClass = (Class<VM>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        mViewModel = new ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(App.getInstance())).get(TUtil.getInstance(this,0));
        return dataBinding.getRoot();
    }

}
