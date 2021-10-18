package com.example.setigi;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class fasilitas extends AppCompatActivity {

    ViewPager viewPager;
    ArrayList<Integer> images = new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);

        getSupportActionBar().setTitle("Fasilitas");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.fasilitas) + "</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);

        viewPager = findViewById(R.id.viewPager);


        //add mage
        images.add(R.drawable.musholla2);
        images.add(R.drawable.kamarmandi2);
        images.add(R.drawable.gazebo2);
        images.add(R.drawable.gazebokembar2);
        images.add(R.drawable.warung2);

        adapter = new Adapter(this, images);
        viewPager.setPadding(100, 0, 100,1);

        viewPager.setAdapter(adapter);
    }
}