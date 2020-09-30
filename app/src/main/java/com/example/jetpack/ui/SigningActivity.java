package com.example.jetpack.ui;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jetpack.R;
import com.example.jetpack.app.App;
import com.example.jetpack.base.BaseActivity;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/28
 * Time: 14:23
 */
public class SigningActivity extends BaseActivity {

    TextView tv_content;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_signing;
    }

    @Override
    protected void initUI(Bundle savedInstanceState) {
        tv_content = findViewById(R.id.tv_content);

        //测试多渠道打包
        ApplicationInfo appInfo = null;
        try {
            appInfo = App.getInstance().getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        String app_version = appInfo.metaData.getString("ATMAN_CHANNEL");
        tv_content.setText(app_version);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }
}
