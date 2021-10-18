package com.example.setigi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

public class rumahadatpapua extends AppCompatActivity {

    private Button btntgradat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumahadatpapua);

        getSupportActionBar().setTitle("Informasi");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.informasi) + "</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);

        btntgradat = (Button) findViewById(R.id.btntgradat);
        btntgradat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rumahadatpapua.this, tg_radat.class);
                startActivity(intent);
            }
        });
    }
}