package com.example.carrentalproject.handlers;

import com.example.carrentalproject.models.Car;
import com.example.carrentalproject.models.RentalStatus;

import java.util.List;

/**
 * Creating a Cars functionality
 */
public class CarHandler {
    private List<Car> cars;



    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);

    }

//    // Allows to add new mileage of the car
//    public void updateCarMileage(Car car, double newMileage) {
//        cars.updateMileage(newMileage);
//
//    }
//
//    public void updateCarRentalAmount(Car car, double newRentalAmount) {
//        cars.setLastRentalAmount(newRentalAmount);
//    }
//
//    public void updateRentalStatus (RentalStatus rentalStatus, RentalStatus newStatus) {
//        cars.RentalStatus
//    }
//

}