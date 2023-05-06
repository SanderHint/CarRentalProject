package com.example.carrentalproject.services;

import com.example.carrentalproject.models.Employee;
import exceptions.EmployeeNotFoundException;

public interface EmployeeService {

    Employee getEmployeeById(Long id) throws EmployeeNotFoundException;

    Employee getAllEmployeesById() throws EmployeeNotFoundException;

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee) throws EmployeeNotFoundException;

    void deleteEmployee(Long id) throws EmployeeNotFoundException;

}