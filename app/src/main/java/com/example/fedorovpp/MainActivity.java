//Первый в очереди запускаемый класс как лаунчер приложения, представляет "экран загрузки".
package com.example.fedorovpp;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                //Запуск класса "Sign_in" для авторизации в приложении.
                Intent intent = new Intent(MainActivity.this, Sign_in.class);
                startActivity(intent);
            }
        };
        //"timer" запускает через 2 секунды событие "timerTask"
        timer.schedule(timerTask, 2000L);
    }
}