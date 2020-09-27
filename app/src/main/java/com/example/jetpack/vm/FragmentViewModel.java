package com.example.jetpack.vm;

import androidx.lifecycle.MutableLiveData;

import com.example.jetpack.base.BaseViewModel;
import com.example.jetpack.model.bean.TabItemData;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/24
 * Time: 15:00
 */
public class FragmentViewModel extends BaseViewModel {

    public final MutableLiveData<TabItemData> mTableItemData = new MutableLiveData<>();
}
