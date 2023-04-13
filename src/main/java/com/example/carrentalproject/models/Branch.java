package com.example.carrentalproject.models;

import java.util.List;

public class Branch {

    private String address;

    private List<String> officeEmployees;

    private List<Car> availableCars;


    public Branch(String address, List<String> officeEmployees, List<Car> availableCars) {
        this.address = address;
        this.officeEmployees = officeEmployees;
        this.availableCars = availableCars;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getOfficeEmployees() {
        return officeEmployees;
    }

    public void setOfficeEmployees(List<String> officeEmployees) {
        this.officeEmployees = officeEmployees;
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(List<Car> availableCars) {
        this.availableCars = availableCars;
    }
}

