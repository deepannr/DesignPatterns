package com.designpatterns.structural.composite.excercise;

interface Faculty {
	void getFacultyDetails();
}

class Staff implements Faculty {
	private String name;
	private String position;
	
	public Staff(String name, String position) {
		this.name = name;
		this.position = position;
	}

	@Override
	public void getFacultyDetails() {
		System.out.println("		" + name + " is the " + position);
	}
}