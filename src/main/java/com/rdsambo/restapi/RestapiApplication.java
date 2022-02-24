package com.rdsambo.restapi;

import com.rdsambo.restapi.model.Employee;
import com.rdsambo.restapi.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}


	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String ... args) throws Exception {
		Employee employee = Employee.builder()
				.firstName("Ramos")
				.lastName("Sambo")
				.email("rdsambo@gmail.com")
				.build();
		employeeRepository.save(employee);

		employee = Employee.builder()
				.firstName("Edu")
				.lastName("Matola")
				.email("edmat@gmail.com")
				.build();
		employeeRepository.save(employee);

		employee = Employee.builder()
				.firstName("Deni")
				.lastName("Mangue")
				.email("dema@gmail.com")
				.build();
		employeeRepository.save(employee);
	}
}
