package com.example.faysal.profilecountry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageview;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageview = findViewById(R.id.imageviewid);
        textview = findViewById(R.id.textviewid);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String countryname = bundle.getString("name");
            showdetails(countryname);
        }




    }

    public void showdetails(String countryname) {
        if (countryname.equals("Bangladesh")) {
            imageview.setImageResource(R.drawable.bangladeshimage1);
            textview.setText(R.string.BangladeshText);
        }
        if (countryname.equals("Canada")) {
            imageview.setImageResource(R.drawable.canadaimage1);
            textview.setText(R.string.CanadaText);
        }
        if (countryname.equals("India")) {
            imageview.setImageResource(R.drawable.indiaimage1);
            textview.setText(R.string.IndiaText);
        }
        if (countryname.equals("Pakistan")) {
            imageview.setImageResource(R.drawable.pakistanimage1);
            textview.setText(R.string.PakistanText);
        }
        if (countryname.equals("Afghanistan")) {
            imageview.setImageResource(R.drawable.afghanistanimage1);
            textview.setText(R.string.AfghanistanText);
        }
        if (countryname.equals("Australia")) {
            imageview.setImageResource(R.drawable.australiaimage1);
            textview.setText(R.string.AustraliaText);
        }
        if (countryname.equals("China")) {
            imageview.setImageResource(R.drawable.chinaimage1);
            textview.setText(R.string.ChinaText);
        }
        if (countryname.equals("Azerbaijan")) {
            imageview.setImageResource(R.drawable.azerbaijanimage);
            textview.setText(R.string.AzerText);
        }
        if (countryname.equals("Srilanka")) {
            imageview.setImageResource(R.drawable.srilankaimage);
            textview.setText(R.string.SrilankaText);
        }
        if (countryname.equals("England")) {
            imageview.setImageResource(R.drawable.englandimage);
            textview.setText(R.string.EnglandText);
        }



    }


}
