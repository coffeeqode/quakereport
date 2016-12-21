package com.example.android.quakereport;

/**
 * Created by sandesh on 19/12/16.
 */

public class Earthquake {

    private String location;
    private double magnitude;
    private String date;
    private String url;

    public Earthquake(String location, double magnitude, String date) {
        this.location = location;
        this.magnitude = magnitude;
        this.date = date;
    }

    public Earthquake(String location, double magnitude, String date, String url) {
        this.location = location;
        this.magnitude = magnitude;
        this.date = date;
        this.url = url;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
