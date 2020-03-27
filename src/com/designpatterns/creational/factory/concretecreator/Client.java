package com.designpatterns.creational.factory.concretecreator;

public class Client {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape rectShape = shapeFactory.getShape(Constants.RECTANGLE);
		rectShape.draw();

		Shape sqShape = shapeFactory.getShape(Constants.SQUARE);
		sqShape.draw();
	}
}