package com.qubixsolutions.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TopCharts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_charts);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Drake", "Nice For What"));
        words.add(new Word("Boo'd Up", "Ella Mai"));
        words.add(new Word("Drake", "God's Plan"));
        words.add(new Word("Childish Gambino", "This is America"));
        words.add(new Word("Kanye West", "Yikes"));
        words.add(new Word("Shawn Mendes", "In My Blood"));
        words.add(new Word("Ed Sheeran", "Perfect"));






        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        TextView mainActivity = (TextView) findViewById(R.id.main_button);


        mainActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mainAcivityIntent = new Intent(TopCharts.this, MainActivity.class);
                startActivity(mainAcivityIntent);
            }
        });
    }
}
