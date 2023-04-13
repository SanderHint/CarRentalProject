package com.example.carrentalproject.models;

import java.util.Date;

public class Booking {
    private Date bookingDate;
    private Customer customer;
    private Car car;
    private Date rentalStartDate;
    private Date rentalEndDate;
    private Branch rentalBranch;
    private Branch returnBranch;
    private double amount;

    public Booking(Date bookingDate, Customer customer, Car car, Date rentalStartDate, Date rentalEndDate, Branch rentalBranch, Branch returnBranch, double amount) {
        this.bookingDate = bookingDate;
        this.customer = customer;
        this.car = car;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.rentalBranch = rentalBranch;
        this.returnBranch = returnBranch;
        this.amount = amount;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(Date rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public Date getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(Date rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public Branch getRentalBranch() {
        return rentalBranch;
    }

    public void setRentalBranch(Branch rentalBranch) {
        this.rentalBranch = rentalBranch;
    }

    public Branch getReturnBranch() {
        return returnBranch;
    }

    public void setReturnBranch(Branch returnBranch) {
        this.returnBranch = returnBranch;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}