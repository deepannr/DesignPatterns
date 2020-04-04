package com.designpatterns.creational.builder.excercise;

public interface MealBuilder {
	void buildBurger();
	
	void buildDrink(DRINKS drinks);
	
	Meal getMeal();
}

class VegMeal implements MealBuilder {
	Meal vegMeal = new Meal();

	@Override
	public void buildBurger() {
			vegMeal.addItem(new VegBurger());
		}

	@Override
	public void buildDrink(DRINKS drinks) {
		if (drinks == DRINKS.COKE) {
			vegMeal.addItem(new Coke());
		} else if (drinks == DRINKS.PEPSI) {
			vegMeal.addItem(new Pepsi());
		}
	}

	@Override
	public Meal getMeal() {
		return vegMeal;
	}
}


class ChickenMeal implements MealBuilder {
	Meal nvMeal = new Meal();

	@Override
	public void buildBurger() {
			nvMeal.addItem(new ChickenBurger());
		}

	@Override
	public void buildDrink(DRINKS drinks) {
		if (drinks == DRINKS.COKE) {
			nvMeal.addItem(new Coke());
		} else if (drinks == DRINKS.PEPSI) {
			nvMeal.addItem(new Pepsi());
		}
	}

	@Override
	public Meal getMeal() {
		return nvMeal;
	}
}