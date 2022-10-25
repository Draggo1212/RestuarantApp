package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText searchET;
    Button menuBTN;
    Button deliveryBTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchET = (EditText) findViewById(R.id.searchET);
        menuBTN = (Button) findViewById(R.id.menuBTN);
        deliveryBTN = (Button) findViewById(R.id.deliveryBTN);



        menuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MenuActivity.class);

                startActivity(myIntent);
            }
        });


    }
}