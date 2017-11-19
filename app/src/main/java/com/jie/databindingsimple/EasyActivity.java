package com.jie.databindingsimple;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jie.databindingsimple.databinding.ActivityEasyBinding;
import com.jie.databindingsimple.entity.User;

/**
 * desc：简单实现
 * author：haojie
 * date：2017/11/19
 */
public class EasyActivity extends AppCompatActivity {
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEasyBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_easy);
        user = new User("Laxus", "J");
        binding.setUser(user);
    }
}
