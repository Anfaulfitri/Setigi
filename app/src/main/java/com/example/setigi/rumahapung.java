package com.example.setigi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

public class rumahapung extends AppCompatActivity {

    private Button btntgrapung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumahapung);

        getSupportActionBar().setTitle("Informasi");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.informasi) + "</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);

        btntgrapung = (Button) findViewById(R.id.btntgrapung);
        btntgrapung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rumahapung.this, tg_rapung.class);
                startActivity(intent);
            }
        });
    }
}