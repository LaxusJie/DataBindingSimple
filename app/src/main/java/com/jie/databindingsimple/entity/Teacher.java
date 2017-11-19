package com.jie.databindingsimple.entity;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * desc：双向绑定测试实体
 * author：haojie
 * date：2017/11/19
 */
public class Teacher {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> className = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
