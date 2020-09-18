package com.example.jetpack.ui;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import com.example.jetpack.R;
import com.example.jetpack.bean.MvvmBaseActivity;
import com.example.jetpack.vm.MyViewModel;

public class MvvmActivity extends MvvmBaseActivity<MyViewModel> {

    private TextView mTextTv;
    private Button mBtn;
    private Toolbar mToolbar;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_mvvm;
    }

    @Override
    protected void initUI() {
        mToolbar = findViewById(R.id.toolbar);
        setToolBar(mToolbar,"MVVM");
        mBtn = findViewById(R.id.btn_text);
        mTextTv = findViewById(R.id.sample_text);

        mViewModel = providers(MyViewModel.class);
    }

    @Override
    public void setContentView(View view) {
        //super.setContentView(view);

        DataBindingUtil.setContentView(this,getLayoutId());
    }

    @Override
    protected void initListener() {
        super.initListener();
        mViewModel.data.observe(this,data->mTextTv.setText(data));
        mBtn.setOnClickListener(view -> mViewModel.data.setValue("321"));
    }

    @Override
    protected void initData() {
        mViewModel.requstData();
    }
}