package com.designpatterns.creational.factory.abstractcreator;

public class RectangleFactory extends AbstractFactory {

	@Override
	protected Shape getFactory() {
		return new Rectangle();
	}
}
