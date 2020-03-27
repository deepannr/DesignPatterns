package com.designpatterns.creational.factory.excercise;

public class Client {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactoryImpl();
		Animal duck = animalFactory.getAnimal(Constants.DUCK);
		duck.walk();
		duck.eat();

		Animal tiger = animalFactory.getAnimal(Constants.TIGER);
		tiger.walk();
		tiger.eat();
	}
}
