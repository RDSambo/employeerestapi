package com.rdsambo.restapi.repository;

import com.rdsambo.restapi.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
