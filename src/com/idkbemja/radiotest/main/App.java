package com.idkbemja.radiotest.main;

import com.idkbemja.radiotest.models.MyFavorites;
import com.idkbemja.radiotest.models.Podcast;
import com.idkbemja.radiotest.models.Song;

public class App {
    public static void main(String[] args) {

        // Song Test
        Song song = new Song();
        song.setTitle("Song Title");
        song.setAlbum("Album Name");
        song.setArtist("Artist Name");
        song.setGender("Genre");

        for (int i = 0; i < 500; i++) {
            song.like();
        }

        for (int i = 0; i < 5000; i++) {
            song.reproduction();
        }

        System.out.println("===========================");
        System.out.println("Total Likes: " + song.getTotalLikes());
        System.out.println("Total Reproductions: " + song.getTotalReproductions());
        System.out.println("==========================");

        // PodCast Test

        Podcast podcast = new Podcast();
        podcast.setTitle("Podcast Title");
        podcast.setPresenter("Presenter Name");
        podcast.setDescription("Podcast Description");

        for (int i = 0; i < 10; i++) {
            podcast.like();
        }
        for (int i = 0; i < 100; i++) {
            podcast.reproduction();
        }

        System.out.println("===========================");
        System.out.println("Total Likes: " + podcast.getTotalLikes());
        System.out.println("Total Reproductions: " + podcast.getTotalReproductions());
        System.out.println("===========================");

        MyFavorites myFavorites = new MyFavorites();
        
        myFavorites.additional(song);
        myFavorites.additional(podcast);

    }
}
