package com.example.carrentalproject.controllers;

import com.example.carrentalproject.models.Car;
import com.example.carrentalproject.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public String getAllCars(Model model) {
        List<Car> cars = carRepository.findAll();
        model.addAttribute("cars", cars);
        return "car/index";
    }

    @GetMapping("/{id}")
    public String getCarById(@PathVariable("id") long id, Model model) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            model.addAttribute("car", car.get());
            return "car/show";
        } else {
            return "car/not-found";
        }
    }

    @GetMapping("/new")
    public String createCarForm(Model model) {
        model.addAttribute("car", new Car());
        return "car/new";
    }

    @PostMapping
    public String createCar(@ModelAttribute("car") Car car) {
        carRepository.save(car);
        return "redirect:/cars";
    }

    @GetMapping("/{id}/edit")
    public String editCarForm(@PathVariable("id") long id, Model model) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            model.addAttribute("car", car.get());
            return "car/edit";
        } else {
            return "car/not-found";
        }
    }

    @PutMapping("/{id}")
    public String editCar(@PathVariable("id") long id, @ModelAttribute("car") Car updatedCar) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            Car existingCar = car.get();
            existingCar.setLicencePlate(updatedCar.getLicencePlate());
            existingCar.setMake(updatedCar.getMake());
            existingCar.setModel(updatedCar.getModel());
            existingCar.setBodyType(updatedCar.getBodyType());
            existingCar.setYearOfProduction(updatedCar.getYearOfProduction());
            existingCar.setColor(updatedCar.getColor());
            existingCar.setMileage(updatedCar.getMileage());
            existingCar.setRentalStatus(updatedCar.getRentalStatus());
            existingCar.setLastRentalAmount(updatedCar.getLastRentalAmount());
            carRepository.save(existingCar);
            return "redirect:/cars";
        } else {
            return "car/not-found";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteCar(@PathVariable("id") long id) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            carRepository.delete(car.get());
            return "redirect:/cars";
        } else {
            return "car/not-found";
        }
    }
}