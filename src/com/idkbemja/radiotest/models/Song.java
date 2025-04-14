package com.idkbemja.radiotest.models;

public class Song extends Audio {
    private String album;
    private String artist;
    private String gender;

    @Override
    public int getClassification() {
        if (getTotalReproductions() > 500) {
            return 8;
        } else {
            return 5;
        }
    }

    // Getters
    public String getAlbum() {
        return album;
    }
    public String getArtist() {
        return artist;
    }
    public String getGender(){
        return gender;
    }

    // Setters
    public void setAlbum(String album) {
        this.album = album;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
