package ru.strukov.p0081viewbyid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    /*
        В этом уроке рассматривалсь то, как работать с view-компонентами экрана из кода.
        То есть, найти view-компонент, поменять ему свойства, и т.п.
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("New text in TextView");

        Button myBtn = (Button) findViewById(R.id.myBtn);
        myBtn.setText("My button");
        myBtn.setEnabled(false);

        CheckBox myChb = (CheckBox) findViewById(R.id.myChb);
        myChb.setChecked(true);

    }
}
