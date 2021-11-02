package com.example.healthanddietapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEventSource;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
//Zakaria, that is a reference to an built-in XML layout document that is part of the Android OS, rather than one of your own XML layouts.

//      Here is a further list of layouts that you can use: http://developer.android.com/reference/android/R.layout.html
//    (Updated link thanks @Estel: https://github.com/android/platform_frameworks_base/tree/master/core/res/res/layout )

public class JiniaAdaptar extends ArrayAdapter<String> {
    private String arr[];
    public JiniaAdaptar(@NonNull Context context, int resource, @NonNull String arr[]) {
        super(context, resource,arr);
        this.arr = arr;
    }
    @Nullable
    @Override
    public String getItem(int position){
        return arr[position];
    }
    @Nullable
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent){
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_jinia_layout, parent, false);
        TextView t1 = convertView.findViewById(R.id.textView);
        TextView t2 = convertView.findViewById(R.id.textView3);
        t2.setText(getItem(position));
        // Before returning the view, add on click listener.
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Lets go!!!!!", Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}