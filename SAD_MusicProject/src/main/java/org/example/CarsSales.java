package org.example;

import jakarta.persistence.*;

@Entity
public class CarsSales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carModel;
    private String bodyType;
    private String transmissionType;
    private int reviewsCount;

    public CarsSales() {
        // Constructor gol necesar pentru JPA
    }

    public CarsSales(String carModel, String bodyType, String transmissionType, int reviewsCount) {
        this.carModel = carModel;
        this.bodyType = bodyType;
        this.transmissionType = transmissionType;
        this.reviewsCount = reviewsCount;
    }


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(int reviewsCount) {
        this.reviewsCount = reviewsCount;
    }
}
