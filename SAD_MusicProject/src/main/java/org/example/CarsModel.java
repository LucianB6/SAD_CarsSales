package org.example;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data

@Entity
@Table(name = "car")
public class CarsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_name")
    private String carModel;

    @Column(name = "body_type")
    private String bodyType;

    @Column(name = "transmission_type")
    private String transmissionType;

    @Column(name = "reviews_count")
    private int reviewsCount;

    @Column(name = "max_torque_nm")
    private double maxTorqueNp;

    @Column(name = "max_torque_rpm")
    private double maxTorqueRpm;

    @Column(name = "max_power_bhp")
    private double maxPowerBhp;

    @Column(name = "max_power_rpm")
    private double maxPowerRpm;

    @Column(name = "engine_displacement")
    private int engineDisplacement;

    @Column(name = "starting_price")
    private int minimumPrice;

    @Column(name = "ending_price")
    private int endingPrice;


    public CarsModel(Long id, String carModel, String bodyType, String transmissionType, int reviewsCount, double maxTorqueNp, double maxTorqueRpm, double maxPowerBhp, double maxPowerRpm, int engineDisplacement, int minimumPrice, int endingPrice) {
        this.id = id;
        this.carModel = carModel;
        this.bodyType = bodyType;
        this.transmissionType = transmissionType;
        this.reviewsCount = reviewsCount;
        this.maxTorqueNp = maxTorqueNp;
        this.maxTorqueRpm = maxTorqueRpm;
        this.maxPowerBhp = maxPowerBhp;
        this.maxPowerRpm = maxPowerRpm;
        this.engineDisplacement = engineDisplacement;
        this.minimumPrice = minimumPrice;
        this.endingPrice = endingPrice;
    }

    public CarsModel() {

    }
}
