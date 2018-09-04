package com.example.android.businessfinder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // UI Elements
    ImageView businessImageView;
    TextView businessNameTextView;
    Button businessPhoneButton;
    Button businessAddressButton;
    TextView businessHoursTextView;
    TextView businessDescriptionTextView;

    // Properties
    String addressURL = "https://www.google.com/maps/dir/''/patent+coffee/@40.7453151,-74.0602495,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x89c259a5ec84b6a3:0x133687c71012544c!2m2!1d-73.9902096!2d40.7453363";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
