package com.designpatterns.structural.adapter.object.area;

public class Client {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 20);
		TriangleAreaAdapter adapter = new TriangleAreaAdapter(triangle);
		System.out.println("Area : " + adapter.getArea(new Rectangle()));
	}
}
