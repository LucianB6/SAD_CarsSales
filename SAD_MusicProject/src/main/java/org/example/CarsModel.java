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

    public CarsModel(Long id, String carModel, String bodyType, String transmissionType, int reviewsCount) {
        this.id = id;
        this.carModel = carModel;
        this.bodyType = bodyType;
        this.transmissionType = transmissionType;
        this.reviewsCount = reviewsCount;
    }
}
