package com.example.setigi;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.Scale;
import android.os.Bundle;
import android.text.Html;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class denah extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denah);

        getSupportActionBar().setTitle("Denah");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.denah) + "</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);

        PhotoView photoView = findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.denah2);

    }

}