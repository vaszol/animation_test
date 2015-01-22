package com.example.vas.animation_test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onAnimation();

    }

    private void onAnimation() {
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

        // получим ссылку на часовую стрелку
        ImageView hour = (ImageView) findViewById(R.id.hour_hand);
        // анимация для стрелки
        Animation hourTurn = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
        // присоединяем анимацию
        hour.startAnimation(hourTurn);
    }

    @Override
    public void onClick(View v) {
        onAnimation();
    }
}
