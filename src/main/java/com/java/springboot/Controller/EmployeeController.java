package com.java.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.springboot.Repository.EmployeeRepository;
import com.java.springboot.model.Employee;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	//To inject the employeeRepository we use this annotation
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Get All employees
	//Annotation for mapping HTTP GET requests onto specific handlermethods
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		employeeRepository.findAll();
		return employeeRepository.findAll();
	}
}
