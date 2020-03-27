package com.designpatterns.creational.factory.abstractcreator;

public abstract class AbstractFactory {
	protected abstract Shape getFactory();
	
	Shape getShape() {
		return getFactory();
	}
}
