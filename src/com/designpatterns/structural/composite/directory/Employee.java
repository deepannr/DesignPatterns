package com.designpatterns.structural.composite.directory;

public interface Employee {
	void showEmployeeDetails();
}

class Developer implements Employee {
	private int empId;
	private String empName;
	private String empPosition;
	
	public Developer(int empId, String empName, String empPosition) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPosition = empPosition;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(empId + " " + empName + " " + empPosition);
	}
}