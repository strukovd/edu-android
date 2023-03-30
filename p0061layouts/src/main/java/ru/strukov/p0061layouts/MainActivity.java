package ru.strukov.p0061layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /*
        В этом уроке было добавлвено несколько макетов активити (экранов),
        с простой целью изучения разнообразия видов layout,
        в работе используется только один.
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alayout);
    }
}
