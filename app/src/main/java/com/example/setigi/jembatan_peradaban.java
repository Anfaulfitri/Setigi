package com.example.setigi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

public class jembatan_peradaban extends AppCompatActivity {

    private Button btntgjembatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jembatan_peradaban);

        getSupportActionBar().setTitle("Informasi");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.informasi) + "</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);

        btntgjembatan = (Button) findViewById(R.id.btntgjembatan);
        btntgjembatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(jembatan_peradaban.this, tg_jembatan.class);
                startActivity(intent);
            }
        });
    }
}