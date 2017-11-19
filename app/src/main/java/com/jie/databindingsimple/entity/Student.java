package com.jie.databindingsimple.entity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.jie.databindingsimple.BR;

/**
 * desc：双向绑定测试实体
 * author：捷
 * date：2017/11/19
 */
public class Student extends BaseObservable {
    private String name;
    private String className;

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public String getClassName() {
        return className;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setClassName(String className) {
        this.className = className;
        notifyPropertyChanged(BR.className);
    }
}
