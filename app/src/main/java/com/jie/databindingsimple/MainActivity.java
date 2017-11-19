package com.jie.databindingsimple;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jie.databindingsimple.databinding.ActivityMainBinding;

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
}
