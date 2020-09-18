package com.example.jetpack.utils;

import android.widget.Toast;

import com.example.jetpack.app.App;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/18
 * Time: 17:36
 */
public class ToastUtils {

    public static void show(String content){
       if(MyToast.mToast!=null){
           MyToast.mToast.setText(content);
           MyToast.mToast.show();
       }
    }

    private static class MyToast {
        public static Toast mToast = Toast.makeText(App.getInstance(), "", Toast.LENGTH_SHORT);
    }
}
