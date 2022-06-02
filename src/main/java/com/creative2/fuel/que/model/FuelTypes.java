package com.creative2.fuel.que.model;

public class FuelTypes {

    private int id;
    private String fuelType;
    private int perLtrPrice;

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

    public int getPerLtrPrice() {
        return perLtrPrice;
    }

    public void setPerLtrPrice(int perLtrPrice) {
        this.perLtrPrice = perLtrPrice;
    }
}
