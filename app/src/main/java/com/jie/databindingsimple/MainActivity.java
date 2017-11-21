package com.jie.databindingsimple;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jie.databindingsimple.databinding.ActivityMainBinding;

/**
 * desc：主页面
 * author：haojie
 * date：2017/11/19
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void toEasy(View view) {
        startActivity(new Intent(this, EasyActivity.class));
    }

    public void toTwoway(View view) {
        startActivity(new Intent(this, TwowayActivity.class));
    }
    
    public void toLayout(View view) {
        startActivity(new Intent(this, LayoutActivity.class));
    }

    public void toRes(View view) {
        startActivity(new Intent(this, ResActivity.class));
    }

    public void toInclude(View view) {
        startActivity(new Intent(this, IncludeActivity.class));
    }
}
