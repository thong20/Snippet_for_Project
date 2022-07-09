package com.example.mysnippet.Demo01_Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.example.mysnippet.R;

public class MainDemo01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_demo01_splash);

        Handler handler = new Handler(Looper.getMainLooper());

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainDemo01.this, Activity_Dashboard.class));
                finish();
            }
        }, 3000);

    }
}