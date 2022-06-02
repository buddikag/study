package com.creative2.fuel.que.model;


//Manage the records fo the vehicle fuel

public class FillingFuel {

    //vehicle checkin time to the que , checkout time from the que and spent amount by vehicle owner
    private String checkInTime;
    private String checkOutTime;
    private  float spentAmount;

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public float getSpentAmount() {
        return spentAmount;
    }

    public void setSpentAmount(int spentAmount) {
        this.spentAmount = spentAmount;
    }
}
