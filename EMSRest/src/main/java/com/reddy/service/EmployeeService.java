package com.reddy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.reddy.bean.Address;
import com.reddy.bean.Employee;

@Service
public class EmployeeService {
	List<Employee> employeeList = new ArrayList<Employee>();

	public EmployeeService() {
		Employee e1 = new Employee("Basil", 3, 45000f, new Address("Kochi"));
		Employee e2 = new Employee("Sai", 2, 80000f, new Address("Kurnool"));
		Employee e3 = new Employee("Reddy", 1, 70000f, new Address("Bellary"));

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
	}

	public Employee getEmployeeById(int empId) {
		System.out.println(employeeList);

		for (Employee emp : employeeList) {
			if (emp.getEmpId() == empId) {
				return emp;
			}
		}

		return null;
	}

}