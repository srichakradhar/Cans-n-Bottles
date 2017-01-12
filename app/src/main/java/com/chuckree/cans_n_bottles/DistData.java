package com.chuckree.cans_n_bottles;

/**
 * Created by Srichakradhar on 06-01-2017.
 */

class DistData {
    private double lat;
    private double lng;
    private int cans;
    private int bottles;

    DistData(){
        this.lat = 0;
        this.lng = 0;
        this.cans = 0;
        this.bottles = 0;
    }

    DistData(double lat, double lng, int cans, int bottles){
        this.lat = lat;
        this.lng = lng;
        this.cans = cans;
        this.bottles = bottles;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getCans() {
        return cans;
    }

    public void setCans(int cans) {
        this.cans = cans;
    }

    public int getBottles() {
        return bottles;
    }

    public void setBottles(int bottles) {
        this.bottles = bottles;
    }
}
