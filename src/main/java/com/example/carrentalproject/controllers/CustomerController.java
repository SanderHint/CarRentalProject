package com.example.carrentalproject.controllers;

import com.example.carrentalproject.models.Customer;
import com.example.carrentalproject.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public String getAllCustomers(Model model) {
        List<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers", customers);
        return "customer/index";
    }

    @GetMapping("/{id}")
    public String getCustomerById(@PathVariable("id") long id, Model model) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            model.addAttribute("customer", customer.get());
            return "customer/show";
        } else {
            return "customer/not-found";
        }
    }

    @GetMapping("/new")
    public String createCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/new";
    }

    @PostMapping
    public String createCustomer(@ModelAttribute("customer") Customer customer) {
        customerRepository.save(customer);
        return "redirect:/customers";
    }

    @GetMapping("/{id}/edit")
    public String editCustomerForm(@PathVariable("id") long id, Model model) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            model.addAttribute("customer", customer.get());
            return "customer/edit";
        } else {
            return "customer/not-found";
        }
    }

    @PutMapping("/{id}")
    public String editCustomer(@PathVariable("id") long id, @ModelAttribute("customer") Customer updatedCustomer) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            Customer existingCustomer = customer.get();
            existingCustomer.setFirstName(updatedCustomer.getFirstName());
            existingCustomer.setLastName(updatedCustomer.getLastName());
            existingCustomer.setEmail(updatedCustomer.getEmail());
            existingCustomer.setAddress(updatedCustomer.getAddress());
            customerRepository.save(existingCustomer);
            return "redirect:/customers";
        } else {
            return "customer/not-found";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable("id") long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            customerRepository.delete(customer.get());
            return "redirect:/customers";
        } else {
            return "customer/not-found";
        }
    }
}