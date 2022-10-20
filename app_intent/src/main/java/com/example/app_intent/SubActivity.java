package com.example.app_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        textView2 = findViewById(R.id.textView2);

        Intent intent = getIntent();  //보내온 intent를 받음
        //데이터 받기
        String name = intent.getStringExtra("str");
        textView2.setText(name);
    }
}