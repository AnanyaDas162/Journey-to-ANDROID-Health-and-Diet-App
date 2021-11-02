package com.example.healthanddietapp;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Double;
import java.lang.Math;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText height;
    EditText weight;
    TextView bmi;
    Button button;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent14 = getIntent();
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        bmi = findViewById(R.id.bmi);
        button = findViewById(R.id.button);
        next = findViewById(R.id.next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String h = height.getText().toString();
                Double d1 = Double.parseDouble(h);
                String w = weight.getText().toString();
                Double d2 = Double.parseDouble(w);
                Double d3 = d2 /(d1 * d1);
                Double d4 = Double.valueOf(Math.round(d3));
                String s = d4.toString();
                bmi.setText("Your BMI: " + s);
            }
        });

    }
    public void  openActivity (View view)
    {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}