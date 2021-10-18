package com.example.setigi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Html;

import org.osmdroid.api.IMapController;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.ScaleBarOverlay;

import java.util.Map;

public class lokasi extends AppCompatActivity {
    private MapView map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi);
        getSupportActionBar().setTitle("Lokasi");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.lokasi) + "</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);

        Context ctx = getApplicationContext();
        Configuration.getInstance().load(ctx, PreferenceManager.getDefaultSharedPreferences(ctx));
        map = (MapView) findViewById(R.id.map);
        map.getTileProvider().clearTileCache();
        Configuration.getInstance().setCacheMapTileCount((short)12);
        Configuration.getInstance().setCacheMapTileOvershoot((short)12);

        map.setTileSource(new OnlineTileSourceBase("", 1, 20, 512, ".png", new String[]{"https://a.tile.openstreetmap.org/"}){
            @Override
            public String getTileURLString(long pMapTileIndex) {
                return getBaseUrl()
                        + MapTileIndex.getZoom(pMapTileIndex)
                        + "/" + MapTileIndex.getX(pMapTileIndex)
                        + "/" + MapTileIndex.getY(pMapTileIndex)
                        + mImageFilenameEnding;
            }
        });

        map.setMultiTouchControls(true);
        IMapController mapController = map.getController();
        GeoPoint startPoint;
        startPoint = new GeoPoint(-6.9524217, 112.5111982);
        mapController.setZoom(16.0);
        //mapController.setZoom(11.0); Sebelumnya
        mapController.setCenter(startPoint);
        final Context context = this;
        map.invalidate();
        createmarker();
    }

    private void createmarker() {
        if (map == null){
            return;
        }

        Marker my_marker = new Marker(map);
        my_marker.setPosition(new GeoPoint(-6.9524217,112.5111982));
        my_marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        my_marker.setTitle("Wisata Alam SETIGI \n (SELO TIRTO GIRI)");
        my_marker.setPanToView(true);
        map.getOverlays().add(my_marker);
        map.invalidate();
    }
}