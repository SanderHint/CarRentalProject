package com.example.carrentalproject.controllers;

import com.example.carrentalproject.models.Rental;
import com.example.carrentalproject.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rentals")
public class RentalController {

    @Autowired
    private RentalRepository rentalRepository;

    // Get all rentals
    @GetMapping("/")
    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }

    // Get a rental by ID
    @GetMapping("/{id}")
    public Rental getRentalById(@PathVariable Long id) {
        return rentalRepository.findById(id).orElse(null);
    }

    // Create a new rental
    @PostMapping("/")
    public Rental createRental(@RequestBody Rental rental) {
        return rentalRepository.save(rental);
    }

    // Update a rental
    @PutMapping("/{id}")
    public Rental updateRental(@PathVariable Long id, @RequestBody Rental rental) {
        Rental existingRental = rentalRepository.findById(id).orElse(null);

        if (existingRental != null) {
            existingRental.setEmployee(rental.getEmployee());
            existingRental.setRentalDate(rental.getRentalDate());
            existingRental.setBooking(rental.getBooking());
            existingRental.setComments(rental.getComments());

            return rentalRepository.save(existingRental);
        } else {
            return null;
        }
    }

    // Delete a rental
    @DeleteMapping("/{id}")
    public void deleteRental(@PathVariable Long id) {
        rentalRepository.deleteById(id);
    }
}