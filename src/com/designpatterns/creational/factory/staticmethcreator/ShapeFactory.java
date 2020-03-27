package com.designpatterns.creational.factory.staticmethcreator;

public class ShapeFactory {

	static Shape getShape(String shapeType) {
		if (Constants.SQUARE.equalsIgnoreCase(shapeType)) {
			return new Square();
		} else if (Constants.RECTANGLE.equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		}
		return null;
	}
}