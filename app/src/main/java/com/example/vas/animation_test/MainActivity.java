package com.example.vas.animation_test;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получим ссылку на солнце
        ImageView sun = (ImageView) findViewById(R.id.sun);
        // Анимация для восхода солнца
        Animation sunRise = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        // Подключаем анимацию к нужному View
        sun.startAnimation(sunRise);
        // Получим ссылку на часы
        ImageView clock = (ImageView) findViewById(R.id.clock);
// анимация для вращения часов
        Animation clockTurn = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        clock.startAnimation(clockTurn);

    }



}
