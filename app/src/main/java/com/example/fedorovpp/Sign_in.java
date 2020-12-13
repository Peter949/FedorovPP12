//Класс входа пользователя с проверкой логина и пароля, а так же перехода между картой и регистрацией.
package com.example.fedorovpp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_in extends AppCompatActivity implements View.OnClickListener
{
    //login & password - значения для входа.
    String login = "serk";
    String password = "123";
    //trigger - переход из окна авторизации в регистрацию пользователя.
    TextView trigger;
    //input - ввод значений log & pass.
    Button input;
    //log & pass - вводимые значения для входа.
    EditText log;
    EditText pass;
    //При создании присваиваем переменным соответствующие объекты из "activity_sign_in.xml".
    //Добавляем слушатель для ввода(input) и регистрации(trigger).
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        trigger = findViewById(R.id.CreateNewAccount);
        trigger.setOnClickListener(this);
        input = findViewById(R.id.button2);
        input.setOnClickListener(this);
        log = findViewById(R.id.log);
        pass = findViewById(R.id.pass);
    }
    //@param View v.
    //@returns void.
    //При нажатии на объект идет проверка на id и выполняется та процедура,
    //которая была идентифицирована по условию switch и переходит в нужный activity.
    //Подусловие в case R.id.button2 - если не верный логин и пароль выводит
    //всплывающее сообщение.
    @Override
    public void onClick(View v)
    {


        switch (v.getId())
        {
            case R.id.CreateNewAccount:
            {
                //Запуск класса "Sign_up" для регистрации.
                Intent intent = new Intent(this, Sign_up.class);
                startActivity(intent);
                break;
            }
            case R.id.button2:
            {
                if(log.getText().toString().equals(login) && pass.getText().toString().equals(password))
                {
                    //Запуск класса "Test", который переходит на карту при авторизации.
                    Intent intent1 = new Intent(this, Test.class);
                    startActivity(intent1);
                }
                else
                {
                    Toast.makeText(Sign_in.this, "Login and Password Failed", Toast.LENGTH_LONG).show();
                }
                break;
            }
        }
    }

}