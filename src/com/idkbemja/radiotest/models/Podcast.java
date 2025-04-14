package com.idkbemja.radiotest.models;

public class Podcast extends Audio {

    private String presenter;
    private String description;

    @Override
    public int getClassification() {
        if (getTotalReproductions() > 2000) {
            return 8;
        } else {
            return 5;
        }
    }

    // Getters
    public String getPresenter() {
        return presenter;
    }
    public String getDescription() {
        return description;
    }
    
    // Setters
    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
