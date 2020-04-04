package com.designpatterns.creational.builder.excercise;

public class Director {
	private MealBuilder builder;
	
	public void construct(MealBuilder myBuilder, DRINKS drinks) {
		builder = myBuilder;
		builder.buildBurger();
		builder.buildDrink(drinks);
	}
}
