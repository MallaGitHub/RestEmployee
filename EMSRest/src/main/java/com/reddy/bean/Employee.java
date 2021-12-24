package com.reddy.bean;

public class Employee {
	private String name;
	private int empId;
	private float salary;
	private Address address;

	public Employee() {
	}

	public Employee(String name, int empId, float salary, Address address) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + ", address=" + address + "]";
	}
	
	

}
