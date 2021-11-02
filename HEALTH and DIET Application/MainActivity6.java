package com.example.healthanddietapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent intent5 = getIntent();
    }
    public void  squats(View view)
    {
        Intent intent10 = new Intent(this, MainActivity10.class);
        startActivity(intent10);
    }
    public void  jogging(View view)
    {
        Intent intent7 = new Intent(this, MainActivity7.class);
        startActivity(intent7);
    }
    public void  lunges(View view)
    {
        Intent intent8 = new Intent(this, MainActivity8.class);
        startActivity(intent8);
    }
    public void  plancks(View view)
    {
        Intent intent9 = new Intent(this, MainActivity9.class);
        startActivity(intent9);
    }
    public void  pushups(View view)
    {
        Intent intent11 = new Intent(this, MainActivity11.class);
        startActivity(intent11);
    }
    public void  running(View view)
    {
        Intent intent12 = new Intent(this, MainActivity12.class);
        startActivity(intent12);
    }
    public void  skip(View view)
    {
        Intent intent13 = new Intent(this, MainActivity13.class);
        startActivity(intent13);
    }
}