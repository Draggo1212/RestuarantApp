package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DeliveryActivity extends AppCompatActivity {

    TextView deliveryTV;
    TextView contactTV;
    TextView locationTV;
    TextView hoursTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);

        deliveryTV = (TextView) findViewById(R.id.deliveryTV);
        contactTV = (TextView) findViewById(R.id.contactTV);
        locationTV = (TextView) findViewById(R.id.locationTV);
        hoursTV = (TextView) findViewById(R.id.hoursTV);

        Intent incomingIntent = getIntent();

    }
}