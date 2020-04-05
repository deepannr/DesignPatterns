package com.designpatterns.creational.prototype.excercise;

public abstract class BasicCar implements Cloneable {
	private String id;
	
	protected String carName;
	
	protected String carColor;
	
	protected Long carPrice;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCarName() {
		return carName;
	}

	public String getCarColor() {
		return carColor;
	}
	
	public Long getCarPrice() {
		return carPrice;
	}
	
	abstract void getCar();
	
	public Object clone() {
		Object myClone = null;
		try {
			myClone = super.clone();
		} catch (CloneNotSupportedException ce) {
			ce.printStackTrace();
		}
		
		return myClone;
	}
}


class Nano extends BasicCar {
	public Nano() {
		carName = "Nano";
		carPrice = 150000L;
		carColor = "Black";
	}

	@Override
	void getCar() {
		System.out.println("Car: " + carName + " Color: " + carColor + " Price is Rs: " + carPrice);
	}
}


class Ford extends BasicCar {
	public Ford() {
		carName = "Ford";
		carPrice = 550000L;
		carColor = "Blue";
	}

	@Override
	void getCar() {
		System.out.println("Car: " + carName + " Color: " + carColor + " Price is Rs: " + carPrice);
	}
}