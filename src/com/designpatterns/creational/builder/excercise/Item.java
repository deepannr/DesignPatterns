package com.designpatterns.creational.builder.excercise;

public interface Item {
	String getName();

	float getPrice();

	Packing getPacking();
}

abstract class Burger implements Item {
	@Override
	public Packing getPacking() {
		return new Wrapper();
	}
}

abstract class Drink implements Item {
	@Override
	public Packing getPacking() {
		return new Bottle();
	}
}

class VegBurger extends Burger {
	@Override
	public String getName() {
		System.out.print("VegBurger, ");
		return "VegBurger";
	}

	@Override
	public float getPrice() {
		System.out.println("Price: 50");
		return 50;
	}
}

class ChickenBurger extends Burger {
	@Override
	public String getName() {
		System.out.print("ChickenBurger, ");
		return "ChickenBurger";
	}

	@Override
	public float getPrice() {
		System.out.println("Price: 75");
		return 75;
	}
}

class Pepsi extends Drink {
	@Override
	public String getName() {
		System.out.print("Pepsi, ");
		return "Pepsi";
	}

	@Override
	public float getPrice() {
		System.out.println("Price: 30");
		return 30;
	}
}

class Coke extends Drink {
	@Override
	public String getName() {
		System.out.print("Coke, ");
		return "Coke";
	}

	@Override
	public float getPrice() {
		System.out.println("Price: 30");
		return 20;
	}
}