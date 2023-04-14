package com.example.carrentalproject.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "cars")

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String make;
    private String model;
    private String bodyType;
    private int yearOfProduction;
    private String color;
    private double mileage;
    private RentalStatus rentalStatus;
    private double lastRentalAmount;

}
