package com.designpatterns.structural.composite.excercise;

public class Client {

	public static void main(String[] args) {
		Faculty matStaff1 = new Staff("Mathemetics Prof1", "Adjunt");
		Faculty matStaff2 = new Staff("Mathemetics Prof2", "Professor");
		
		Faculty csStaff1 = new Staff("CSE Prof1", "Adjunt");
		Faculty csStaff2 = new Staff("CSE Prof2", "Professor");
		Faculty csStaff3 = new Staff("CSE Prof3", "Professor");
		
		Supervisor hodMath = new Supervisor("Das", "HOD", "Mathemetics");
		Supervisor hodCse = new Supervisor("SarCar", "HOD", "CSE");
		
		Supervisor dean = new Supervisor("Deepan", "Dean", "");
		
		
		hodMath.addFaculty(matStaff1);
		hodMath.addFaculty(matStaff2);
		
		hodCse.addFaculty(csStaff1);
		hodCse.addFaculty(csStaff2);
		hodCse.addFaculty(csStaff3);
		
		dean.addFaculty(hodMath);
		dean.addFaculty(hodCse);
		
		dean.getFacultyDetails();
	}
}
