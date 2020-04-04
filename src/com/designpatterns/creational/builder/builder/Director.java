package com.designpatterns.creational.builder.builder;

public class Director {
	private BuilderInterface localBuilder;
	
	public void construct(BuilderInterface builder) {
		this.localBuilder = builder;
		localBuilder.buildVehicle();
		localBuilder.addWheels();
		localBuilder.addHeadLights();
	}
}
