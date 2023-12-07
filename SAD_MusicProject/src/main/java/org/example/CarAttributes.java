package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarsSales {
    private String carModel;
    private String bodyType;
    private String transmissionType;
    private int reviewsCount;

    public CarsSales(String carModel, String bodyType, String transmissionType, int reviewsCount) {
        this.carModel = carModel;
        this.bodyType = bodyType;
        this.transmissionType = transmissionType;
        this.reviewsCount = reviewsCount;
    }
}
