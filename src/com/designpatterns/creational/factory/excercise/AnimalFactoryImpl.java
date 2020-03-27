package com.designpatterns.creational.factory.excercise;

public class AnimalFactoryImpl implements AnimalFactory {
	@Override
	public Animal getAnimal(String animalType) {
		if (Constants.TIGER.equalsIgnoreCase(animalType)) {
			return new Tiger();
		} else if (Constants.DUCK.equalsIgnoreCase(animalType)) {
			return new Duck();
		}

		return null;
	}
}
