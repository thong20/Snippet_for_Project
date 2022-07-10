package com.example.mysnippet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mysnippet.Demo01_Splash.MainDemo01;
import com.example.mysnippet.Demo02_Battery_Capacity.MainDemo02;
import com.example.mysnippet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn01.setOnClickListener(this);
        binding.btn02.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_01: startActivity(new Intent(MainActivity.this, MainDemo01.class)); break;
            case R.id.btn_02: startActivity(new Intent(MainActivity.this, MainDemo02.class)); break;

        }
    }
}