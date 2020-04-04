package com.designpatterns.creational.builder.builder;

public interface BuilderInterface {
	Product product = new Product();
	
	void buildVehicle();

	void addWheels();

	void addHeadLights();
	
	Product getVehicle();
}

class Car implements BuilderInterface {

	@Override
	public void buildVehicle() {
		System.out.println("Building a Car");
	}

	@Override
	public void addWheels() {
		System.out.println("Adding 4 wheels");
	}

	@Override
	public void addHeadLights() {
		System.out.println("Adding 2 head lights");
	}
	
	@Override
	public Product getVehicle() {
		return product;
	}
}

class MotorCycle implements BuilderInterface {

	@Override
	public void buildVehicle() {
		System.out.println("Building Motor Cycle");
	}

	@Override
	public void addWheels() {
		System.out.println("Adding 2 Wheels");
	}

	@Override
	public void addHeadLights() {
		System.out.println("Adding 1 head light");
	}
	
	@Override
	public Product getVehicle() {
		return product;
	}
}