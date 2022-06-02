package com.creative2.fuel.que.model;

public class Container {

    private int noOfLiters;
    private String arrivalDate;
    private String arrivalTime;
    private FuelType fuelType;


    public int getNoOfLiters() {
        return noOfLiters;
    }

    public void setNoOfLiters(int noOfLiters) {
        this.noOfLiters = noOfLiters;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public FuelType getFuelTypes() {
        return fuelType;
    }

    public void setFuelTypes(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
