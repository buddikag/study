package com.creative2.fuel.que.service;

import com.creative2.fuel.que.model.FillingFuel;
import com.creative2.fuel.que.model.FuelTypes;

public class FillQuantity {

    int filledQuantity ;

    public  void filledQuantityCalculation(FillingFuel fillingFuel, FuelTypes fuelTypes){

        fillingFuel.setSpentAmount(5000);
        fuelTypes.setPerLtrPrice(125);
        filledQuantity = fuelTypes.getPerLtrPrice() / fillingFuel.getSpentAmount();
        System.out.println(filledQuantity);
//
    }

    public static void main(String[] args) {
        FillQuantity fillQuantity = new FillQuantity();
        
        FillingFuel fillingFuel = new FillingFuel();
        FuelTypes fuelType = new FuelTypes();
        fillQuantity.filledQuantityCalculation( fillingFuel, fuelType);
    }

}
