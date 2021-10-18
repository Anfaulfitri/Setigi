package com.example.setigi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

public class profiledevelop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiledevelop);

        getSupportActionBar().setTitle("Profile Developper");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.developper) + "</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);
    }
}