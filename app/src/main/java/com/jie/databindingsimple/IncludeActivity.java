package com.jie.databindingsimple;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.jie.databindingsimple.databinding.ActivityIncludeBinding;

public class IncludeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityIncludeBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_include);

        binding.setBtnText("~include~");
    }

    public void btnClick(View view) {
        Toast.makeText(this, "the btn clicked!", Toast.LENGTH_SHORT).show();
    }
}
