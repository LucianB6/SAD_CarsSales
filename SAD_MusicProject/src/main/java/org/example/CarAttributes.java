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
public class CarAttributes {
    private String carModel;

    private double maxTorqueNp;
    private double maxTorqueRpm;
    private double maxPowerBhp;
    private double maxPowerRpm;
    private int engineDisplacement;
    private int minimumPrice;
    private int maximumPrice;


    public CarAttributes(String carModel, double maxTorqueNp, double maxTorqueRpm, double maxPowerBhp, double maxPowerRpm, int engineDisplacement, int minimumPrice, int maximumPrice) {
        this.carModel = carModel;
        this.maxTorqueNp = maxTorqueNp;
        this.maxTorqueRpm = maxTorqueRpm;
        this.maxPowerBhp = maxPowerBhp;
        this.maxPowerRpm = maxPowerRpm;
        this.engineDisplacement = engineDisplacement;
        this.minimumPrice = minimumPrice;
        this.maximumPrice = maximumPrice;
    }

    public CarAttributes(){
    }
}
