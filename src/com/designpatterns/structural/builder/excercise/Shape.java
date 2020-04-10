package com.designpatterns.structural.builder.excercise;

abstract class Shape {
	Color color;

	public Shape(Color color) {
		this.color = color;
	}

	abstract void draw(int border);

	abstract void modify(int border, int increment);
}

class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	void draw(int border) {
		System.out.print("Draw Triangle with ");
		color.fillWithColor(border); 
	}

	@Override
	void modify(int border, int increment) {
		System.out.println(
				"Modify Triangle with " + increment + " increment and border is " + (increment * border) + " inch");
	}
}

class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	void draw(int border) {
		System.out.print("Draw Triangle with ");
		color.fillWithColor(border);
	}

	@Override
	void modify(int border, int increment) {
		System.out.println(
				"Modify Rectangle with " + increment + " increment and border is " + (increment * border) + " inch");
	}
}
