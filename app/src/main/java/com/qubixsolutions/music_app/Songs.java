package com.qubixsolutions.music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Kaleo", "No Good"));
        words.add(new Word("Welshly", "Arms"));
        words.add(new Word("Matt Maeson", "Grace Digger"));
        words.add(new Word("Kina Grannis", "Creep"));
        words.add(new Word("Nathan Ball", "Crazy"));
        words.add(new Word("Dermot Kennedy", "a closeness"));






        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
