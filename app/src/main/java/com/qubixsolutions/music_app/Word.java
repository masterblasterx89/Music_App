package com.qubixsolutions.music_app;

public class Word {

    private String mArtists;

    private String mSongs;

    public Word(String Artists, String Songs) {
        mArtists = Artists;
        mSongs = Songs;
    }


    public String getArtists() {
        return mArtists;
    }

    public String getSongs() {
        return mSongs;
    }
}
