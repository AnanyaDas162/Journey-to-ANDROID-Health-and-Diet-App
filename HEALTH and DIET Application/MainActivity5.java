package com.example.healthanddietapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity5 extends AppCompatActivity {
     ListView listView2;
     String arr2[] = {"Exercise often","Eat a healthy breakfast daily","Stay hydrated","Eat whole foods","Eat responsibly and mindfully","Plan your meals ahead of time","Decrease screen time","Keep a positive attitude","Continue your healthy eating habits"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Intent intent3 = getIntent();
        listView2 = findViewById(R.id.listView2);
        JiniaAdaptar adaptar = new JiniaAdaptar(this, R.layout.my_jinia_layout,arr2);
        listView2.setAdapter(adaptar);
    }
    public void  exercise (View view)
    {
        Intent intent5 = new Intent(this, MainActivity6.class);
        startActivity(intent5);
    }
}
