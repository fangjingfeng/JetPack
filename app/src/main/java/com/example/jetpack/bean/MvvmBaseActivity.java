package com.example.jetpack.bean;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.jetpack.app.App;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/18
 * Time: 16:03
 */
public abstract class MvvmBaseActivity<T extends ViewModel> extends BaseActivity {

    protected T mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initListener() {
        super.initListener();
        //providers(TUtil.getInstance(this,0));
    }

    protected <T extends ViewModel> T providers(@NonNull Class modelClass) {
        Log.d("TAG",modelClass.toString());
        return (T) new ViewModelProvider(getViewModelStore(),new ViewModelProvider.AndroidViewModelFactory(App.getInstance())).get(modelClass);
    }
}
