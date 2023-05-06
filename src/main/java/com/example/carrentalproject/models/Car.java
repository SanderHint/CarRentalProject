package com.example.carrentalproject.models;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Data
@Table(name = "cars")

public class Car {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String licencePlate;
    private String make;
    private String model;
    private String bodyType;
    private int yearOfProduction;
    private String color;
    private double mileage;
    private RentalStatus rentalStatus;
    private double lastRentalAmount;

}
