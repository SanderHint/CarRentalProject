package com.example.carrentalproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.carrentalproject.models.Return;
import com.example.carrentalproject.repositories.ReturnRepository;

@Controller
public class ReturnController {

    @Autowired
    private ReturnRepository returnRepository;

    @GetMapping("/returns")
    public String listReturns(Model model) {
        Iterable<Return> returns = returnRepository.findAll();
        model.addAttribute("returns", returns);
        return "returns/list";
    }
}
