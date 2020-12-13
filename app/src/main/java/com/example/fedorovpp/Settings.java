//Класс представляет из себя вкладку настроек пользователя.
package com.example.fedorovpp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity implements View.OnClickListener
{
    ImageView back; //Переменная "back" нужна для возвращение к карте
    @Override
    //При запуске класса присваиваем переменному объект для взаимодействия с картинкой.
    //Слушатель для переменной позволит при клике на картинку выполнять определенное действие.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        back = findViewById(R.id.set);
        back.setOnClickListener(this);
    }
    //@param View v.
    //@returns void.
    //v.getID() получает значение из функции onClick от параметра v.
    public void onClick(View v)
    {
        //Запуск класса "Test", как возвращение на карту.
        Intent intent = new Intent(this, Test.class);
        startActivity(intent);
    }
}