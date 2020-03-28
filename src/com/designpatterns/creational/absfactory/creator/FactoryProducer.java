package com.designpatterns.creational.absfactory.creator;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (Constants.SHAPE.equalsIgnoreCase(choice)) {
			return new ShapeFactory();
		} else if (Constants.COLOR.equalsIgnoreCase(choice)) {
			return new ColorFactory();
		}
		return null;
	}
}
