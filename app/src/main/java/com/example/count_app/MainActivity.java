package com.example.count_app;

import static com.example.count_app.R.id.counttext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome, counter;
    Button btn;
    public int counter1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.button);
        welcome= findViewById(R.id.textView);
        counter= findViewById(counttext);

        //adding

        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
            counter.setText(""+inceasecounter());
            }
        });

    }

    public int inceasecounter(){
        return ++counter1;
    }
}