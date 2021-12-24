package com.reddy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.reddy.bean.Employee;
import com.reddy.service.EmployeeService;

@RestController
@RequestMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/{empID}")
	//@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Employee object not found")
	public ResponseEntity<Employee> getEmployeeByID(@PathVariable("empID") int empId) {
		System.out.println("EMployees");
		Employee emp = employeeService.getEmployeeById(empId);
		ResponseEntity<Employee> entity = null;
		if (emp == null) {
			entity = new ResponseEntity<Employee>(emp, HttpStatus.NOT_FOUND);
		} else {
			// entity = new ResponseEntity<Employee>(emp, HttpStatus.OK);
			entity = new ResponseEntity<Employee>(emp, HttpStatus.OK);
		}
		return entity;
	}

	@GetMapping()
	public String getAllEmployees() {

		return "Get all Emp by id";
	}

	@PutMapping
	public String updateEmployee() {
		return "Update Employees";
	}

	@DeleteMapping
	public String deleteEmployee() {
		return "Delete Employees";
	}

	@PostMapping
	public String createEmployee() {
		return "Create Employees";
	}
}