package com.example.shayfahnators.uncgo;

/**
 * Created by the shayfahnators 2.0 on 4/26/2015.
 */
public class latLong {

    Double latitude;
    Double longitude;

    public latLong(Double lat, Double lon){
        latitude = lat;
        longitude = lon;
    }

    public Double getLat(){
        return latitude;
    }
    public Double getLon(){
        return longitude;
    }

    public void setLat(Double lat){
        latitude = lat;
    }
    public void setLon(Double lon){
        longitude = lon;
    }




}