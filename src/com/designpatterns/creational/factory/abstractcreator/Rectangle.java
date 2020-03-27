package com.designpatterns.creational.factory.abstractcreator;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw Rectangle inside Draw method");
	}
}
