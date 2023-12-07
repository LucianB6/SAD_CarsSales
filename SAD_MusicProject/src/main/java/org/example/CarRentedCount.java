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
public class CarRentedCount {
    private String carMake;
    private String carModel;
    private long count;

    public CarRentedCount(String carMake, String carModel, long count) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.count = count;
    }
}
