package com.idkbemja.radiotest.models;

public class MyFavorites {

    public void additional(Audio audio) {
        if (audio.getClassification() >= 8) {
            System.out.println(audio.getTitle() + " is a favorite!");
        } else {
            System.out.println(audio.getTitle() + " is not a favorite.");
        }
    }
}
