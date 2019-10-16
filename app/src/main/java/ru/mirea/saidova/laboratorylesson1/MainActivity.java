package ru.mirea.saidova.laboratorylesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button MyButton = (Button) findViewById(R.id.MyButton);
        Button MyButton1 =(Button)  findViewById(R.id.MyButton1);
        MyButton.setText("My button");
//        MyButton1.setText("My button");

    }
}
