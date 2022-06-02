package com.creative2.fuel.que.service;

import com.creative2.fuel.que.model.FillingFuel;
import com.creative2.fuel.que.model.FuelType;

public class FillQuantity {

    float filledQuantity ;

    public  void filledQuantityCalculation(FillingFuel fillingFuel, FuelType fuelType){


        filledQuantity =  fillingFuel.getSpentAmount()/ fuelType.getPerLtrPrice();

        System.out.println(fuelType.getPerLtrPrice() );
        System.out.println(fillingFuel.getSpentAmount());
        System.out.println(filledQuantity);

//
    }

    public static void main(String[] args) {
        FillQuantity fillQuantity = new FillQuantity();

        FillingFuel fillingFuel = new FillingFuel();

       fillingFuel.setSpentAmount(1000);

        FuelType fuelType = new FuelType();

        fuelType.setPerLtrPrice(360);
        fillQuantity.filledQuantityCalculation( fillingFuel, fuelType);
    }





}
