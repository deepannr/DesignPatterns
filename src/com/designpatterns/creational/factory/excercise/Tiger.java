package com.designpatterns.creational.factory.excercise;

public class Tiger implements Animal {

	@Override
	public void walk() {
		System.out.println("Tiger walks and runs");
	}

	@Override
	public void eat() {
		System.out.println("Tiger eats other animals");
	}
}
