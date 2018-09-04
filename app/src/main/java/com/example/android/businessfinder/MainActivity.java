package com.example.android.businessfinder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
    private String businessName = "Patent Coffee";
    private String addressURL = "https://www.google.com/maps/dir/''/patent+coffee/@40.7453151,-74.0602495,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x89c259a5ec84b6a3:0x133687c71012544c!2m2!1d-73.9902096!2d40.7453363";
    private String businessAddress = "49 W 27th St, New York, NY 10001";
    private String businessPhoneNumberPretty = "(212) 689-4000";
    private String businessPhoneNumberRaw = "2126894000";
    private String businessHours = "\nMonday: 7:30AM–4PM\n" +
            "Tuesday: 7:30AM–4PM\n" +
            "Wednesday: 7:30AM–4PM\n" +
            "Thursday: 7:30AM–4PM\n" +
            "Friday: 7:30AM–4PM\n" +
            "Saturday: 9AM–4PM\n" +
            "Sunday: 9AM–4PM";
    private String businessDescription = "Take-out counter for espresso drinks, cold brews & pastries, with a hidden door to a bar by night.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        businessImageView = findViewById(R.id.businessImageView);
        businessNameTextView = findViewById(R.id.nameLabel);
        businessPhoneButton = findViewById(R.id.contactPhoneButton);
        businessAddressButton = findViewById(R.id.addressButton);
        businessHoursTextView = findViewById(R.id.hoursTextView);
        businessDescriptionTextView = findViewById(R.id.descriptionTextView);

        businessImageView.setImageResource(R.drawable.);
        businessNameTextView.setText(businessName);
        businessPhoneButton.setText("Phone: " + businessPhoneNumberPretty);
        businessAddressButton.setText("Address: " + businessAddress);
        businessHoursTextView.setText("Hours of Operation:\n" + businessHours);
        businessDescriptionTextView.setText("Description: " + businessDescription);
    }

    // Actions
    public void onPhoneNumberClick(View v) {
        Uri number = Uri.parse("tel:" + businessPhoneNumberRaw);
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

    public void onAddressClick(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(addressURL));
        startActivity(browserIntent);
    }
}
