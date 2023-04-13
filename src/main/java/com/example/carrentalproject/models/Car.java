package com.example.carrentalproject.models;

public class Car {
    private String make;
    private String model;
    private String bodyType;
    private int yearOfProduction;
    private String color;
    private double mileage;
    private RentalStatus rentalStatus;
    private double lastRentalAmount;

    public Car(String make, String model, String bodyType, int yearOfProduction, String color, double mileage) {
        this.make = make;
        this.model = model;
        this.bodyType = bodyType;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.mileage = mileage;
        this.rentalStatus = RentalStatus.AVAILABLE;
        this.lastRentalAmount = 0.0;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public RentalStatus getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(RentalStatus rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public double getLastRentalAmount() {
        return lastRentalAmount;
    }

    public void setLastRentalAmount(double lastRentalAmount) {
        this.lastRentalAmount = lastRentalAmount;
    }
}