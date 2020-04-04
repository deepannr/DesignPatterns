package com.designpatterns.creational.builder.excercise;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		MealBuilder vegMeal = new VegMeal();
		MealBuilder nvMeal = new ChickenMeal();
		
		director.construct(vegMeal, DRINKS.PEPSI);
		
		director.construct(nvMeal, DRINKS.COKE);
		System.out.println("--- Vegeterian Meal ---");
		Meal vegieMeal = vegMeal.getMeal();
		vegieMeal.getItems();
		vegieMeal.getPrice();
		
		System.out.println("--- Non Vegeterian Meal ---");
		Meal nonVMeal = nvMeal.getMeal();
		nonVMeal.getItems();
		nonVMeal.getPrice();
	}
}
