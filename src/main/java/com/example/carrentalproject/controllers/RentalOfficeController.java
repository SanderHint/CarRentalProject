package com.example.carrentalproject.controllers;
import com.example.carrentalproject.models.RentalOffice;
import com.example.carrentalproject.repositories.RentalOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/rentaloffice")
public class RentalOfficeController {

    @Autowired
    private RentalOfficeRepository rentalOfficeRepository;

    @GetMapping("/{id}")
    @ResponseBody
    public RentalOffice getRentalOfficeById(@PathVariable("id") Long id) {
        return rentalOfficeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rental office not found with id " + id));
    }

    @PostMapping("/")
    @ResponseBody
    public RentalOffice createRentalOffice(@RequestBody RentalOffice rentalOffice) {
        return rentalOfficeRepository.save(rentalOffice);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public RentalOffice updateRentalOfficeById(@PathVariable("id") Long id, @RequestBody RentalOffice rentalOffice) {
        return rentalOfficeRepository.findById(id)
                .map(existingRentalOffice -> {
                    existingRentalOffice.setOfficeName(rentalOffice.getOfficeName());
                    existingRentalOffice.setInternetDomain(rentalOffice.getInternetDomain());
                    existingRentalOffice.setContactAddress(rentalOffice.getContactAddress());
                    existingRentalOffice.setOwner(rentalOffice.getOwner());
                    existingRentalOffice.setLogoType(rentalOffice.getLogoType());
                    return rentalOfficeRepository.save(existingRentalOffice);
                })
                .orElseThrow(() -> new RuntimeException("Rental office not found with id " + id));
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteRentalOfficeById(@PathVariable("id") Long id) {
        rentalOfficeRepository.deleteById(id);
    }
}