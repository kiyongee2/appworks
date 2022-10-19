package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.myapp3.databinding.ActivityLayoutEx3Binding;

public class layoutEx3 extends AppCompatActivity
implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
    ActivityLayoutEx3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_layout_ex3);

        binding = ActivityLayoutEx3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //이벤트 등록
        binding.bellName.setOnClickListener(this);
        binding.onoff.setOnCheckedChangeListener(this);
        binding.repeatCheck.setOnCheckedChangeListener(this);
        binding.vibrate.setOnCheckedChangeListener(this);

        /*binding.onoff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean isChecked) {
                /*if(button == binding.onoff){*/
                    //showToast("Switch is " + isChecked);  //showToast() 호출
               /* }
            }
        });

        binding.repeatCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean isChecked) {
                /*if(button == binding.repeatCheck){*/
                    //showToast("Repeat CheckBox is " + isChecked);
                /*}
            }
        });

        binding.bellName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* if(view == binding.bellName){*/
                    //showToast("BellName is clicked");
                /*}
            }
        });

        binding.vibrate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean isChecked) {
                /*if(button == binding.vibrate){*/
                    //showToast("Vibration is " + isChecked);
                /*}
            }
        });*/
    }//onCreate()

    //Toast 메서드 정의
    private void showToast(String message){
        Toast.makeText(layoutEx3.this, message,
                Toast.LENGTH_SHORT).show();
    }

    //Switch, CheckBox 이벤트
    @Override
    public void onCheckedChanged(CompoundButton button, boolean isChecked) {
        if(button == binding.onoff){
            showToast("Switch is " + isChecked);
        }else if(button == binding.repeatCheck){
            showToast("Repeat CheckBox is " + isChecked);
        }else if(button == binding.vibrate){
            showToast("Vibration is " + isChecked);
        }
    }

    //벨 이름 클릭 이벤트
    @Override
    public void onClick(View view) {
        showToast("BellName is clicked");
    }
}