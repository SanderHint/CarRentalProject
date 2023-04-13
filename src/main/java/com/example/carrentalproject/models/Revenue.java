package com.example.carrentalproject.models;

import java.util.List;

public class Revenue {
    private List<Booking> bookings;

    public Revenue(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public double calculateRevenue() {
        double totalRevenue = 0;
        for (Booking booking : bookings) {
            totalRevenue += booking.getAmount();
        }
        return totalRevenue;
    }
}