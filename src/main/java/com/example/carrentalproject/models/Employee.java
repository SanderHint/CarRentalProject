package com.example.carrentalproject.models;

public class Employee {
    private String name;
    private String surname;
    private JobPosition jobPosition;
    private Branch branch;

    public Employee(String name, String surname, JobPosition jobPosition, Branch branch) {
        this.name = name;
        this.surname = surname;
        this.jobPosition = jobPosition;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public Branch getBranch() {
        return branch;
    }
}