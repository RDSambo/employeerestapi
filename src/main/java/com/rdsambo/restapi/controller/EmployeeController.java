package com.rdsambo.restapi.controller;

import java.util.List;

import com.rdsambo.restapi.model.Employee;
import com.rdsambo.restapi.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> fetchEmployeeRespository(){
        return employeeRepository.findAll();
    }

}
