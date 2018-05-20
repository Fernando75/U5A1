package com.example.duarte.u5a1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv_weather = (ImageView) findViewById(R.id.iv_weather);
        int identificador = getResources().getIdentifier("imagen_13d", "drawable", getPackageName());

        iv_weather.setImageDrawable(getResources().getDrawable(identificador, null));

    }
}
