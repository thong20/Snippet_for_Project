package com.example.mysnippet.Demo02_Battery_Capacity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mysnippet.R;

public class MainDemo02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_demo02);

        TextView tv_capacity = findViewById(R.id.demo02_tv_capacity);

        int capacity = getBatteryCapacity();

        tv_capacity.setText(capacity +" mAh");
    }

    public int getBatteryCapacity() {
        Object mPowerProfile_ = null;
        double result = 0;

        final String POWER_PROFILE_CLASS = "com.android.internal.os.PowerProfile";

        try {
            mPowerProfile_ = Class.forName(POWER_PROFILE_CLASS)
                    .getConstructor(Context.class).newInstance(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            result = (Double) Class
                    .forName(POWER_PROFILE_CLASS)
                    .getMethod("getAveragePower", java.lang.String.class)
                    .invoke(mPowerProfile_, "battery.capacity");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (int) result;
    }
}