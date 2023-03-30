package ru.strukov.p0091onclickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
        В этом уроке рассматривалось то,
        как добавить простой обработчик событий по нажатию но кнопки
        путем - поска view-компонентов при создании экрана, и назначения им функций обработчиков
    */
    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // найдем View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tvOut.setText("Нажата кнопка ОК");
            }
        };

        btnOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCancel = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tvOut.setText("Нажата кнопка CANCEL");
            }
        };

        btnCancel.setOnClickListener(oclBtnCancel);
    }
}
