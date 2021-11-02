package com.example.healthanddietapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
    }
    public void  loseWeight (View view)
    {
        Intent intent2 = new Intent(this, MainActivity2.class);
        startActivity(intent2);
    }
    public void  maintainWeight (View view)
    {
        Intent intent3 = new Intent(this, MainActivity5.class);
        startActivity(intent3);
    }
    public void  gainWeight (View view)
    {
        Intent intent4 = new Intent(this, MainActivity4.class);
        startActivity(intent4);
    }
}