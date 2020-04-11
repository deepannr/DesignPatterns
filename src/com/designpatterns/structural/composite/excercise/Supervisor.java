package com.designpatterns.structural.composite.excercise;

import java.util.List;
import java.util.ArrayList;

public class Supervisor implements Faculty {
	private List<Faculty> facultyList = new ArrayList<>();
	private String name;
	private String department;
	private String designation;
	
	public Supervisor(String name, String designation, String department) {
		this.name = name;
		this.department = department;
		this.designation = designation;
	}
	
	public void addFaculty(Faculty faculty) {
		facultyList.add(faculty);
	}
	
	public void removeFaculty(Faculty faculty) {
		facultyList.remove(faculty);
	}

	@Override
	public void getFacultyDetails() {
		System.out.println("	" + name + " is " + designation + " of " + department + " Department");
		facultyList.forEach(Faculty::getFacultyDetails);
	}
}
