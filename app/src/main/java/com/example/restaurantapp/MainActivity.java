package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText searchET;
    Button menuBTN;
    Button deliveryBTN;
    Button doneBTN;
    String message;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchET = (EditText) findViewById(R.id.searchET);
        menuBTN = (Button) findViewById(R.id.menuBTN);
        deliveryBTN = (Button) findViewById(R.id.deliveryBTN);
        doneBTN = (Button) findViewById(R.id.doneBTN);
        message = "";



        menuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MenuActivity.class);

                startActivity(myIntent);
            }
        });


        deliveryBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, DeliveryActivity.class);

                startActivity(myIntent);
            }
        });

        doneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String search = searchET.getText().toString();
                if(search.equals("menu")){
                    Intent myIntent = new Intent(MainActivity.this, MenuActivity.class);

                    startActivity(myIntent);
                }
                else if(search.equals("delivery")){
                    Intent myIntent = new Intent(MainActivity.this, DeliveryActivity.class);

                    startActivity(myIntent);
                }
                else{
                    message = "you did not type correctly please type menu or delivery";
                }
                Toast myToast = Toast.makeText(getApplicationContext() , message , Toast.LENGTH_SHORT);
                myToast.show();
            }
        });


    }
}