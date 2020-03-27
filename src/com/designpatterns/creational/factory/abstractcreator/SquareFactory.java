package com.designpatterns.creational.factory.abstractcreator;

public class SquareFactory extends AbstractFactory {

	@Override
	protected Shape getFactory() {
		return new Square();
	}
}
