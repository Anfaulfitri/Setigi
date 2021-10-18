package com.example.setigi;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class tg_radat extends AppCompatActivity {

    private VrPanoramaView panowidgetView;
    private ImageLoaderTask backgroundImageLoaderTaskRadat;
    private Button nextmadina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tg_radat);
        panowidgetView = (VrPanoramaView) findViewById(R.id.radat);
        loadPanoImage();

        getSupportActionBar().setTitle("Tour Guide");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.tourguide) + "</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);

        nextmadina = (Button) findViewById(R.id.nextmadina);
        nextmadina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tg_radat.this, mushollamadinah.class);
                startActivity(intent);
            }
        });
    }

    private synchronized void loadPanoImage() {
        ImageLoaderTask task = backgroundImageLoaderTaskRadat;
        if (task != null && !task.isCancelled()) {
            // Cancel any task from a previous loading.
            task.cancel(true);
        }

        // pass in the name of the image to load from assets.
        VrPanoramaView.Options viewOptions = new VrPanoramaView.Options();
        viewOptions.inputType = VrPanoramaView.Options.TYPE_MONO;

        // use the name of the image in the assets/ directory.
        String panoImageName = "baru19.jpg";

        // create the task passing the widget view and call execute to start.
        task = new ImageLoaderTask(panowidgetView, viewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundImageLoaderTaskRadat = task;
    }
}