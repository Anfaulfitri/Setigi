package com.example.setigi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.slice.Slice;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout btnprofilewisata,btnwisata,btnfasilitas,btnlokasi, btndenah, btndevelop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mengganti warna
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>"));

        btnprofilewisata = findViewById(R.id.btnprofilewisata);
        btnwisata = findViewById(R.id.btnwisata);
        btnfasilitas = findViewById(R.id.btnfasilitas);
        btnlokasi = findViewById(R.id.btnlokasi);
        btndenah = findViewById(R.id.btndenah);
        btndevelop = findViewById(R.id.btndevelop);

        btnprofilewisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, profilewisata.class);
                startActivity(intent);
            }
        });

        btnwisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, wisata.class);
                startActivity(intent);
            }
        });

        btnfasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fasilitas.class);
                startActivity(intent);
            }
        });

        btnlokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, lokasi.class);
                startActivity(intent);
            }
        });

        btndenah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, denah.class);
                startActivity(intent);
            }
        });

        btndevelop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, profiledevelop.class);
                startActivity(intent);
            }
        });



        ;
       //image slider
        SliderView sliderView = findViewById(R.id.imageslider);

        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.slider);
        images.add(R.drawable.slider1);
        images.add(R.drawable.slider2);
        images.add(R.drawable.slider3);

        MyAdapter myAdapter = new MyAdapter(images);

        sliderView.setSliderAdapter(myAdapter);
        sliderView.setAutoCycle(true);
        sliderView.setSliderTransformAnimation(SliderAnimations.ZOOMOUTTRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
    }
}