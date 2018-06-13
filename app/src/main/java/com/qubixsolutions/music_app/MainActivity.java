package com.qubixsolutions.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView songs = (TextView) findViewById(R.id.songs);


        songs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, Songs.class);
                startActivity(songsIntent);
            }
        });


        TextView topChart = (TextView) findViewById(R.id.topChart);


        topChart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent topChartIntent = new Intent(MainActivity.this, TopCharts.class);
                startActivity(topChartIntent);
            }
        });








    }
}
