package com.example.carrentalproject.controllers;

import com.example.carrentalproject.models.Booking;
import com.example.carrentalproject.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @PostMapping("/")
    public @ResponseBody Booking addNewBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }

    @GetMapping("/{id}")
    public @ResponseBody Booking getBookingById(@PathVariable Long id) {
        return bookingRepository.findById(id).orElseThrow(() -> new RuntimeException("Booking not found"));
    }

    @PutMapping("/{id}")
    public @ResponseBody Booking updateBooking(@PathVariable Long id, @RequestBody Booking updatedBooking) {
        Booking booking = bookingRepository.findById(id).orElseThrow(() -> new RuntimeException("Booking not found"));
        booking.setPickUpDate(updatedBooking.getPickUpDate());
        booking.setReturnDate(updatedBooking.getReturnDate());
        // other fields to update
        return bookingRepository.save(booking);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String deleteBooking(@PathVariable Long id) {
        Booking booking = bookingRepository.findById(id).orElseThrow(() -> new RuntimeException("Booking not found"));
        bookingRepository.delete(booking);
        return "Booking deleted successfully";
    }
}