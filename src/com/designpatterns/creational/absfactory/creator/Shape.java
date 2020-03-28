package com.designpatterns.creational.absfactory.creator;

public interface Shape {
	void draw();
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square Class :: Draw method");
	}
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle Class :: Draw method");
	}

}