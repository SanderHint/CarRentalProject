package com.example.carrentalproject.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.carrentalproject.models.Return;
import com.example.carrentalproject.repositories.ReturnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @Autowired
    private ReturnRepository returnRepository;

    @GetMapping("/{id}")
    public Return getReturnById(@PathVariable Long id) {
        return returnRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public Return createReturn(@RequestBody Return newReturn) {
        return returnRepository.save(newReturn);
    }

    @PutMapping("/{id}")
    public Return updateReturn(@PathVariable Long id, @RequestBody Return updatedReturn) {
        Return existingReturn = returnRepository.findById(id).orElse(null);
        if (existingReturn == null) {
            return null;
        }

        existingReturn.setEmployee(updatedReturn.getEmployee());
        existingReturn.setReturnDate(updatedReturn.getReturnDate());
        existingReturn.setBooking(updatedReturn.getBooking());
        existingReturn.setAdditionalPayment(updatedReturn.getAdditionalPayment());
        existingReturn.setComments(updatedReturn.getComments());

        return returnRepository.save(existingReturn);
    }

    @DeleteMapping("/{id}")
    public void deleteReturn(@PathVariable Long id) {
        returnRepository.deleteById(id);
    }
}