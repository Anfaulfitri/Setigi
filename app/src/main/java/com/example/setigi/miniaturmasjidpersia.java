package com.example.setigi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

public class miniaturmasjidpersia extends AppCompatActivity {

    private Button btntgpersia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miniaturmasjidpersia);

        getSupportActionBar().setTitle("Informasi");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.informasi) + "</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);

        btntgpersia = (Button) findViewById(R.id.btntgpersia);
        btntgpersia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(miniaturmasjidpersia.this, tg_mpersia.class);
                startActivity(intent);
            }
        });
    }
}