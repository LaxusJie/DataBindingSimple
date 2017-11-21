package com.jie.databindingsimple;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jie.databindingsimple.databinding.ActivityLayoutBinding;
import com.jie.databindingsimple.entity.Student;
import com.jie.databindingsimple.entity.User;

/**
 * desc：布局用法
 * author：haojie
 * date：2017/11/19
 */
public class LayoutActivity extends AppCompatActivity {
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_layout);
        User user = new User("Laxus", "J");
        binding.setUser(user);
        Student student = new Student();
        student.setName("xiaoming");
        student.setBoy(true);
        binding.setStudent(student);
    }
}
