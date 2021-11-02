package com.example.healthanddietapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity4 extends AppCompatActivity {
    private ListView listView3;
    String arr3[] = {"Eat More Calories Than Your Body Burns","Eat Plenty of Protein","Fill up on Plenty of Carbs and Fat ","Eat Energy-Dense Foods and Use Sauces & Spices ","Lift Heavy Weights and Improve Your Strength","Don’t drink water before meals","Drink enough milk. ","Don’t smoke","Get quality sleep"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent4 = getIntent();
        listView3 = findViewById(R.id.listView3);
        JiniaAdaptar adaptar = new JiniaAdaptar(this, R.layout.my_jinia_layout,arr3);
        listView3.setAdapter(adaptar);
    }
    public void  exercise (View view)
    {
        Intent intent5 = new Intent(this, MainActivity6.class);
        startActivity(intent5);
    }
}