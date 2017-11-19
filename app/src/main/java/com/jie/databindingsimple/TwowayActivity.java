package com.jie.databindingsimple;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.jie.databindingsimple.databinding.ActivityTwowayBinding;
import com.jie.databindingsimple.entity.Student;

/**
 * desc：双向绑定例子
 * author：haojie
 * date：2017/11/19
 */
public class TwowayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoway);
        ActivityTwowayBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_twoway);
        Student student = new Student();
        binding.setStudent(student);
        student.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int i) {
                switch (i) {
                    case BR.name:
                        Toast.makeText(TwowayActivity.this, "name", Toast.LENGTH_SHORT).show();
                        break;
                    case BR.className:
                        Toast.makeText(TwowayActivity.this, "classname", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
