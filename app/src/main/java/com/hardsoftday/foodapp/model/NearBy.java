package com.hardsoftday.foodapp.model;

public class NearBy {

    String name;
    Integer imageUrl;
    String time;

    public NearBy(String name, Integer imageUrl, String time) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



}
