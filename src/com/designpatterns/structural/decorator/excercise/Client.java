package com.designpatterns.structural.decorator.excercise;

class Client {
	public static void main(String[] args) {
		System.out.println("---Component---");
		ShapeComponent square = new Square();
		square.draw();
		ShapeComponent rectangle = new Rectangle();
		rectangle.draw();

		System.out.println("---Decorator---");
		ShapeDecorator blue = new BlueDecorator(square);
		blue.draw();

		ShapeDecorator green = new GreenDecorator(rectangle);
		green.draw();
	}
}
