package com.designpatterns.creational.builder.builder;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		
		BuilderInterface carBuilder = new Car();
		director.construct(carBuilder);
		Product car = carBuilder.getVehicle();
		car.show();
		
		BuilderInterface bikeBuilder = new MotorCycle();
		director.construct(bikeBuilder);
		Product motorCycle = bikeBuilder.getVehicle();
		motorCycle.show();
	}

}
