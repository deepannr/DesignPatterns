package com.designpatterns.creational.factory.abstractcreator;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw Circle inside Draw method");
	}
}
