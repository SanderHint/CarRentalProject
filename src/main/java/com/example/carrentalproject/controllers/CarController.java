package com.example.carrentalproject.controllers;
import com.example.carrentalproject.models.Car;
import com.example.carrentalproject.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
@RequestMapping("/car")
public class CarController {
    // methods for handling HTTP requests related to cars
    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }


    // UPDATE MILEAGE
//    @PostMapping
//    public void updateCarMileage(Car car, double newMileage) {
//        carService.updateMileage(newMileage);


    }
}
