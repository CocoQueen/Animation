package com.example.coco.bomb.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.coco.bomb.R;

public class WeatherActivity extends AppCompatActivity implements View.OnClickListener {

    private WeatherView weatherView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        weatherView = findViewById(R.id.weather);
        weatherView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            weatherView.startAnim();
    }
}
