package com.creative2.fuel.que.model;

public class VehicleOwner {

    private int id;
    private int mobileNumber;
    private String nearestFillingStation;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getNearestFillingStation(){

        return nearestFillingStation;
    }

    public void setNearestFillingStation(String nearestFillingStation) {
        this.nearestFillingStation = nearestFillingStation;
    }
}
