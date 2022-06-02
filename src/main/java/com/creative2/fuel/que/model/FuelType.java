package com.creative2.fuel.que.model;

public class FuelType {

    //Handel fuel type(petrol/diesel) per ltr price

    private int id;
    private String fuelType;
    private float perLtrPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getPerLtrPrice() {
        return perLtrPrice;
    }

    public void setPerLtrPrice(int perLtrPrice) {
        this.perLtrPrice = perLtrPrice;
    }
}
