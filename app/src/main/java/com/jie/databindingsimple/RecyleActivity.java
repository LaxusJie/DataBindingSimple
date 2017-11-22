package com.jie.databindingsimple;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.jie.databindingsimple.databinding.ActivityRecyleBinding;

/**
 * desc：列表用法
 * author：haojie
 * date：2017/11/22
 */
public class RecyleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyleBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_recyle);

        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(new UserAdapter());
    }
}
