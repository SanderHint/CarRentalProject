package com.example.carrentalproject.handlers;

import com.example.carrentalproject.models.RentalOffice;

import java.util.ArrayList;
import java.util.List;
    public class RentalOfficeHandler {
        private final List<RentalOffice> rentalOffices;

        public RentalOfficeHandler() {
            rentalOffices = new ArrayList<>();
        }

        public void addRentalOffice(RentalOffice rentalOffice) {
            rentalOffices.add(rentalOffice);
        }

        public void updateRentalOffice(RentalOffice rentalOffice) {
            int index = rentalOffices.indexOf(rentalOffice);
            if (index >= 0) {
                rentalOffices.set(index, rentalOffice);
            }
        }

        public void deleteRentalOffice(RentalOffice rentalOffice) {
            rentalOffices.remove(rentalOffice);
        }
    }

