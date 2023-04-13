package com.example.carrentalproject.models;

import java.util.Date;

public class Rental {
    private Employee employee;
    private Date rentalDate;
    private Booking booking;
    private String comments;

    public Rental(Employee employee, Date rentalDate, Booking booking, String comments) {
        this.employee = employee;
        this.rentalDate = rentalDate;
        this.booking = booking;
        this.comments = comments;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}