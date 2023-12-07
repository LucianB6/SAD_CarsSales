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
public class CarProfitable {
    private String carMake;
    private String carModel;

    private double profit;
    private int carYear;
    private int count;

    public CarProfitable(String carModel, String carMake, double profit, int carYear) {
        this.carModel = carModel;
        this.carMake = carMake;

        this.profit = profit;
        this.carYear = carYear;
    }

}
