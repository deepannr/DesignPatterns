package com.designpatterns.creational.absfactory.creator;

/**
 * As this is a demo, Interface segregation principle is not followed.
 * 
 * @author ab75812
 */

public abstract class AbstractFactory {
	/**
	 * Abstract Factory is the factory of factories. Where this creates 2 factories
	 * Color and Shape
	 */
	abstract Shape getShape(String shape);

	abstract Color getColor(String color);
}

class ShapeFactory extends AbstractFactory {
	@Override
	Shape getShape(String shape) {
		switch (shape) {
		case Constants.SQUARE:
			return new Square();

		case Constants.RECTANGLE:
			return new Rectangle();

		default:
			return null;
		}
	}

	@Override
	Color getColor(String color) {
		return null;
	}
}

class ColorFactory extends AbstractFactory {
	@Override
	Color getColor(String color) {
		switch (color) {
		case Constants.BLACK:
			return new Black();

		case Constants.BLUE:
			return new Blue();

		default:
			return null;
		}
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}