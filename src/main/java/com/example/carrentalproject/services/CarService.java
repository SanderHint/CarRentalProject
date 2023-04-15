package com.example.carrentalproject.services;

import com.example.carrentalproject.models.Car;
import com.example.carrentalproject.models.RentalStatus;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    Car getCarById(Long id);
    Car addCar(Car car);
    void updateCar(Car car);
    void deleteCar(Long id);
    void updateCarMileage(Long id, double newMileage);
    void updateCarRentalAmount(Long id, double newRentalAmount);
    void updateRentalStatus(Long id, RentalStatus newStatus);
}