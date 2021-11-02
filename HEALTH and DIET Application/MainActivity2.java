package com.example.healthanddietapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    String arr [] = {"Do not skip breakfast.","Eat regular meals", "Eat plenty of fruit and veg", "Get more active.", "Drink plenty of water", "Eat high fibre foods", "Read food labels", "Use a smaller plate", "Do not ban foods", "Do not stock junk food","Cut down on alcohol", "Plan your meals","Increase your body activity","Eat Mindfully"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         Intent intent2 = getIntent();
        listView = findViewById(R.id.listView3);
        JiniaAdaptar adaptar = new JiniaAdaptar(this, R.layout.my_jinia_layout,arr);
        listView.setAdapter(adaptar);
    }
    public void  exercise (View view)
    {
        Intent intent5 = new Intent(this, MainActivity6.class);
        startActivity(intent5);
    }
}