package com.example.setigi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class wisata extends AppCompatActivity {

    private LinearLayout btnjembatan, btntangga, btnminiatur, btnrumah, btnmusholla, btnrumahapung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        getSupportActionBar().setTitle("Wisata");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.wisata) + "</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);

        btnjembatan = findViewById(R.id.btnjembatan);
        btntangga = findViewById(R.id.btntangga);
        btnminiatur = findViewById(R.id.btnminiatur);
        btnrumah = findViewById(R.id.btnrumah);
        btnmusholla = findViewById(R.id.btnmusholla);
        btnrumahapung = findViewById(R.id.btnrumahapung);

        btnjembatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wisata.this, jembatan_peradaban.class);
                startActivity(intent);
            }
        });

        btntangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wisata.this, tanggaderajat.class);
                startActivity(intent);
            }
        });

        btnminiatur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wisata.this, miniaturmasjidpersia.class);
                startActivity(intent);
            }
        });

        btnrumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wisata.this, rumahadatpapua.class);
                startActivity(intent);
            }
        });

        btnmusholla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wisata.this, mushollamadinah.class);
                startActivity(intent);
            }
        });

        btnrumahapung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wisata.this, rumahapung.class);
                startActivity(intent);
            }
        });

    }
}