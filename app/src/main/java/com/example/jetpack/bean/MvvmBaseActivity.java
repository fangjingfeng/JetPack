package com.example.jetpack.bean;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.jetpack.app.App;
import com.example.jetpack.utils.TUtil;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/18
 * Time: 16:03
 */
public abstract class MvvmBaseActivity<VM extends ViewModel,VDb extends ViewDataBinding> extends BaseActivity {

    protected VM mViewModel;
    protected VDb dataBinding;

    @Override
    protected void setLayoutId() {
        //super.setLayoutId();
        dataBinding = DataBindingUtil.setContentView(this,getLayoutId());
        dataBinding.setLifecycleOwner(this);
//        Class<VM> vmClass = (Class<VM>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        mViewModel = new ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(App.getInstance())).get(TUtil.getInstance(this,0));
    }

    @Override
    protected void initListener() {}
}
