package com.jie.databindingsimple;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jie.databindingsimple.databinding.ActivityResBinding;

/**
 * desc：资源数据用法
 * author：haojie
 * date：2017/11/21
 */
public class ResActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityResBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_res);

        binding.setLarge(true);
        binding.setFirstName("Laxus");
        binding.setLastName("J");
        binding.setIsVisible(true);
    }
}
