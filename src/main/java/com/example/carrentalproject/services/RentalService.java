package com.example.carrentalproject.services;

import com.example.carrentalproject.models.Car;
import com.example.carrentalproject.models.Customer;

import java.time.LocalDate;

public interface RentalService {

    /**
     * Rents a car to a customer for a specified number of days.
     * @param car the car to be rented.
     * @param customer the customer who is renting the car.
     * @param startDate the start date of the rental period.
     * @param endDate the end date of the rental period.
     * @return the total cost of the rental.
     */
    double rentCar(Car car, Customer customer, LocalDate startDate, LocalDate endDate);

    /**
     * Returns a car that was previously rented by a customer.
     * @param car the car to be returned.
     * @param customer the customer who is returning the car.
     * @param returnDate the date when the car is returned.
     * @return the amount to be refunded to the customer if applicable.
     */
    double returnCar(Car car, Customer customer, LocalDate returnDate);

}