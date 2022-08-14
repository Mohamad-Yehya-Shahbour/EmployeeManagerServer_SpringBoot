package com.yehya.employeemanager.service;

import com.yehya.employeemanager.exception.UserNotFoundException;
import com.yehya.employeemanager.model.Employee;
import com.yehya.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }


}
