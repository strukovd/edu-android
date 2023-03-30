package ru.strukov.p0051layoutfiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /*
        В этом уроке было добавлвено 2 макета экрана (активити),
        вертикальный (по умолч.) и горизонтальный,
        стандартный макет activity_main.xml больше не используется,
        т.к. теперь в метод setContentView передается ресурс нового макета,
        горизонтальный макет вызывается автоматически, при повороте экрана,
        достигается это за счет того, что в xml горизонтального макета указаны
        дополнительный свойства, определяющие ориентацию макета.
    */
    @Override //Переопределение родительского метода
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Вызов метода родительского класса
        setContentView(R.layout.myscreen); //Вызов лэйаута, в R.java создаются константы (дескрипторы) на все ресурс файлы.
    }
}
