package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText searchET;
    Button menuBTN;
    Button deliveryBTN;
    private ProgressBar mProgressBar;
    private TextView mLoadingText;

    private int mProgressStatus = 0;

    private Handler mHandler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchET = (EditText) findViewById(R.id.searchET);
        menuBTN = (Button) findViewById(R.id.menuBTN);
        deliveryBTN = (Button) findViewById(R.id.deliveryBTN);

        mProgressBar = (ProgressBar) findViewById(R.id.progressbar);
        mLoadingText = (TextView) findViewById(R.id.LoadingCompleteTV);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mProgressStatus < 100)
                    mProgressStatus++;
                    android.os.SystemClock.sleep(50);
                    mHandler.post(new Runnable() {
                      @Override
                      public void run() {
                          mProgressBar.setProgress(mProgressStatus);
                      }
                    });
                    mHandler.post(new Runnable(){
                        @Override
                        public void run() {
                            mLoadingText.setVisibility(View.VISIBLE);
                        }
                    })
                }
        });


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
                Intent myIntent = new Intent(MainActivity.this, MenuActivity.class);

                startActivity(myIntent);
            }
        });


    }
}