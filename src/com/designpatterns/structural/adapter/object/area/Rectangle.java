package com.designpatterns.structural.adapter.object.area;

class Rectangle {
	public double length;
	public double width;
}

class Triangle {
	public double base;
	public double height;
	
	public Triangle(double b, double h) {
		base = b;
		height = h;
	}
}