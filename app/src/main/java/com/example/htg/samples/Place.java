package com.example.htg.samples;

public class Place {

    private String namePlace;
    private String descriptionPlace;
    private int imgPlace;

    public Place(String namePlace, String descriptionPlace, int imgPlace) {
        this.namePlace = namePlace;
        this.descriptionPlace = descriptionPlace;
        this.imgPlace = imgPlace;
    }

    public String getNamePlace() {
        return namePlace;
    }

    public String getDescriptionPlace() {
        return descriptionPlace;
    }

    public int getImgPlace() {
        return imgPlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    public void setDescriptionPlace(String descriptionPlace) {
        this.descriptionPlace = descriptionPlace;
    }

    public void setImgPlace(int imgPlace) {
        this.imgPlace = imgPlace;
    }
}
