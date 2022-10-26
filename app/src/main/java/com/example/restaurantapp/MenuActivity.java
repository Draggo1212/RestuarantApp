package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    TextView menuTV;
    Button burgersBTN;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menuTV = (TextView) findViewById(R.id.menuTV);
        burgersBTN = (Button) findViewById(R.id.burgersBTN);

        Intent incomingIntent = getIntent();
    }

    
}