package com.example.carrentalproject.services;

import com.example.carrentalproject.models.Car;
import com.example.carrentalproject.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public void addCar(Car car) {
        carRepository.save(car);
    }

    public void updateCar(Long id, Car car) {
        Car existingCar = carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));
        existingCar.setMake(car.getMake());
        existingCar.setModel(car.getModel());
        existingCar.setBodyType(car.getBodyType());
        existingCar.setYearOfProduction(car.getYearOfProduction());
        existingCar.setColor(car.getColor());
        existingCar.setMileage(car.getMileage());
        carRepository.save(existingCar);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}