package com.example.app_permission;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

import com.example.app_permission.databinding.ActivityDialogExBinding;

public class DialogEx extends AppCompatActivity {
    ActivityDialogExBinding binding;
    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDialogExBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        //alert dialog 클릭 이벤트
        binding.btnAlert.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this) ;
            builder.setIcon(android.R.drawable.ic_dialog_alert);
            builder.setTitle("알림");
            builder.setMessage("정말 종료 하시겠습니까?");
            //builder.setPositiveButton("OK", dialogListener);
            builder.setNegativeButton("NO", null);
            alertDialog = builder.create();
            alertDialog.show();
        });
    }
}