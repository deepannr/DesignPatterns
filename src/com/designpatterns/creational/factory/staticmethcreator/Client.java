package com.designpatterns.creational.factory.staticmethcreator;

public class Client {

	public static void main(String[] args) {
		Shape sqShape = ShapeFactory.getShape(Constants.SQUARE);
		sqShape.draw();

		Shape rectShape = ShapeFactory.getShape(Constants.RECTANGLE);
		rectShape.draw();
	}
}
