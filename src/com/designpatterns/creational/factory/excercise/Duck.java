package com.designpatterns.creational.factory.excercise;

public class Duck implements Animal {

	@Override
	public void walk() {
		System.out.println("Duck Quacks");

	}

	@Override
	public void eat() {
		System.out.println("Duck Eats fish, insects");
	}
}
