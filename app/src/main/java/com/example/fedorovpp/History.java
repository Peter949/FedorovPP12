//Класс представляет из себя вкладку истории пользователя.
package com.example.fedorovpp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class History extends AppCompatActivity implements View.OnClickListener
{
    ImageView back; //Переменная "back" нужна для возвращение к карте
    @Override
    //При запуске класса присваиваем переменному объект для взаимодействия с картинкой.
    //Слушатель для переменной позволит при клике на картинку выполнять определенное действие.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        back = findViewById(R.id.his);
        back.setOnClickListener(this);
    }
    //@param View v.
    //@returns void.
    public void onClick(View v)
    {
        //v.getID() получает значение из функции onClick от параметра v.
        switch (v.getId())
        {
            case R.id.his: //Выполняется при условии v.getID() = R.id.his.
            {
                //Запуск класса "Test", как возвращение на карту.
                Intent intent = new Intent(this, Test.class);
                startActivity(intent);
            }
        }
    }
}