package com.idkbemja.radiotest.models;

public class Audio {

    private String title;

    private int totalReproductions;

    private int totalLikes;

    private int classification;

    public void like() {
        totalLikes++;
    }

    public void reproduction () {
        totalReproductions++;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public int getTotalReproductions() {
        return totalReproductions;
    }
    
    public int getTotalLikes() {
        return totalLikes;
    }
    
    public int getClassification() {
        return classification;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }
    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }
}
