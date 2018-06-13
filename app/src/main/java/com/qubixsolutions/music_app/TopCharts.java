package com.qubixsolutions.music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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
        words.add(new Word("Imagine Dragons", "Whatever it Takes"));





        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
