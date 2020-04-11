package com.designpatterns.structural.decorator.excercise;

interface ShapeComponent {
	void draw();
}

class Rectangle implements ShapeComponent {
	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}
}

class Square implements ShapeComponent {
	@Override
	public void draw() {
		System.out.println("Draw Square");
	}
}