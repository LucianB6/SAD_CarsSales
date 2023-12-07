package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*
determining the link between various attributes and
features (ABS, CA, consumption, engine power
and torque, &so on) and car prices, car classes and
subclasses;
 */
@Getter
@Setter
@ToString
public class CarPrices {
    private String carMake;
    private String carModel;

    private double carPrice;
    private int carYear;

    public CarPrices(String carMake, String carModel, double carPrice, int carYear) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.carYear = carYear;
    }
}
