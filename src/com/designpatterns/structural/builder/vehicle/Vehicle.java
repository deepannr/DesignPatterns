package com.designpatterns.structural.builder.vehicle;

abstract class Vehicle {
	Workshop produce;
	Workshop assemble;
	
	public Vehicle(Workshop produce, Workshop assemble) {
		this.produce = produce;
		this .assemble = assemble;
	}

	abstract void manufacture();
}

class Car extends Vehicle {
	public Car(Workshop produce, Workshop assemble) {
		super(produce, assemble);
	}

	@Override
	void manufacture() {
		System.out.print("Car ");
		produce.work();
		assemble.work();
	}
}

class Bike extends Vehicle {
	public Bike(Workshop produce, Workshop assemble) {
		super(produce, assemble);
	}

	@Override
	void manufacture() {
		System.out.print("Bike ");
		produce.work();
		assemble.work();
	}
}