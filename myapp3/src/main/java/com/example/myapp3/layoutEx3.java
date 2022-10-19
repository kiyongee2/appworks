package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.myapp3.databinding.ActivityLayoutEx3Binding;

public class layoutEx3 extends AppCompatActivity {
    ActivityLayoutEx3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_layout_ex3);

        binding = ActivityLayoutEx3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.onoff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean isChecked) {
                if(button == binding.onoff){
                    showToast("Switch is " + isChecked);  //showToast() 호출
                }
            }
        });

        binding.repeatCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean isChecked) {
                if(button == binding.repeatCheck){
                    showToast("Repeat CheckBox is " + isChecked);
                }
            }
        });
    }//onCreate() 끝

    //Toast 메서드 정의
    private void showToast(String message){
        Toast.makeText(layoutEx3.this, message,
                Toast.LENGTH_SHORT).show();
    }
}