package org.example;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

@Entity
@Table(name = "car_sales")
public class CarProfitableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_make")
    private String carMake;

    @Column(name = "commission_earned")
    private double profit;

    @Column(name = "car_year")
    private int carYear;

    @Column(name = "sale_price")
    private int carPrice;
}
