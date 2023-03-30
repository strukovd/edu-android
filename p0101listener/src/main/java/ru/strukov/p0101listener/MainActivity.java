package ru.strukov.p0101listener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
        Этот урок является продолжение предыдущего (обработка клик событий),
        но более оптимизированный вариант создания (только одного) обработчика событий.

        Как объясняет автор урока, оптимизация заключается в следующем:
        Есть правило – чем меньше объектов вы создаете, тем лучше,
        т.к. под каждый объект выделяется память, а это достаточно ограниченный ресурс,
        особенно для телефонов. Поэтому создавать один обработчик для нескольких View
        это правильнее с точки зрения оптимизации.
        К тому же кода становится меньше и читать его удобнее.

        т.к. обработчик принимает параметром View инициировавший событие,


        В этом уроке рассматривалась опти
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

        // создание обработчика
        View.OnClickListener oclBtn = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // по id определеяем кнопку, вызвавшую этот обработчик
                switch (v.getId())
                {
                    case R.id.btnOk:
                        // кнопка ОК
                        tvOut.setText("Нажата кнопка ОК");
                        break;
                    case R.id.btnCancel:
                        // кнопка Cancel
                        tvOut.setText("Нажата кнопка Cancel");
                        break;
                }
            }
        };

        btnOk.setOnClickListener(oclBtn);
        btnCancel.setOnClickListener(oclBtn);
    }
}
