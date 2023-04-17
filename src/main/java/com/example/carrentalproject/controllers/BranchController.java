package com.example.carrentalproject.controllers;

import com.example.carrentalproject.models.Branch;
import com.example.carrentalproject.repositories.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/branches")
public class BranchController {

    @Autowired
    private BranchRepository branchRepository;

    @PostMapping("/")
    public @ResponseBody Branch addNewBranch(@RequestBody Branch branch) {
        return branchRepository.save(branch);
    }

    @GetMapping("/{id}")
    public @ResponseBody Branch getBranchById(@PathVariable Long id) {
        return branchRepository.findById(id).orElseThrow(() -> new RuntimeException("Branch not found"));
    }

    @PutMapping("/{id}")
    public @ResponseBody Branch updateBranch(@PathVariable Long id, @RequestBody Branch updatedBranch) {
        Branch branch = branchRepository.findById(id).orElseThrow(() -> new RuntimeException("Branch not found"));
        branch.setAddress(updatedBranch.getAddress());
        // other fields to update
        return branchRepository.save(branch);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String deleteBranch(@PathVariable Long id) {
        Branch branch = branchRepository.findById(id).orElseThrow(() -> new RuntimeException("Branch not found"));
        branchRepository.delete(branch);
        return "Branch deleted successfully";
    }
}