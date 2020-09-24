package com.example.jetpack.vm;

import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/18
 * Time: 15:02
 */
public class MyViewModel extends AndroidViewModel {
    public MyViewModel(@NonNull Application application) {
        super(application);
    }

    public final MutableLiveData<String> data = new MutableLiveData();

    public void requstData(){
        data.setValue("123");
    }

    public void btnTestClike(View view){
        data.setValue("00000");
    }
}
