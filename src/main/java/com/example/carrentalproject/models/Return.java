package com.example.carrentalproject.models;

public class Return {
    private Employee employee;
    private ReturnDate returnDate;
    private Booking booking;
    private double additionalPayment;
    private String comments;

    public Return(Employee employee, ReturnDate returnDate, Booking booking, double additionalPayment, String comments) {
        this.employee = employee;
        this.returnDate = returnDate;
        this.booking = booking;
        this.additionalPayment = additionalPayment;
        this.comments = comments;
    }

    public Employee getEmployee() {
        return employee;
    }

    public ReturnDate getReturnDate() {
        return returnDate;
    }

    public Booking getBooking() {
        return booking;
    }

    public double getAdditionalPayment() {
        return additionalPayment;
    }

    public String getComments() {
        return comments;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setReturnDate(ReturnDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setAdditionalPayment(double additionalPayment) {
        this.additionalPayment = additionalPayment;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}