package com.designpatterns.structural.composite.directory;

import java.util.List;
import java.util.ArrayList;

public class Manager implements Employee {
	private List<Employee> empDetails = new ArrayList<>();
	
	private String name;
	
	private double salary;
	
	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("---Name:" + getName() + " Salary: " + getSalary());
		empDetails.forEach(Employee::showEmployeeDetails);
	}
	
	public void addEmployee(Employee employee) {
		empDetails.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		empDetails.remove(employee);
	}
}
