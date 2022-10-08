package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View v)
    {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText("More text");
    }
    public void button2Click(View v)
    {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setTextColor(Color.RED);
    }
}