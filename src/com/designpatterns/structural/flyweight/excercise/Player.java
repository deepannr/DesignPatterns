package com.designpatterns.structural.flyweight.excercise;

interface Player {
	void mission();

	void assignWeapon(WEAPON weapon);
}

class Terrorist implements Player {
	// Intrinsic Data
	private final String TASK;
	
	// Extrinsic Data
	private WEAPON weapon;

	public Terrorist() {
		TASK = "Plant bomb";
	}

	@Override
	public void mission() {
		System.out.println("Terrorist with weapon " + weapon + " | Task is " + TASK);
	}

	@Override
	public void assignWeapon(WEAPON weapon) {
		this.weapon = weapon;
	}
}

class CounterTerrorist implements Player {
	// Intrinsic Data
	private final String TASK;
	
	// Extrinsic Data
	private WEAPON weapon;

	public CounterTerrorist() {
		TASK = "Diffuse Bomb";
	}

	@Override
	public void mission() {
		System.out.println("Counter Terrorist with weapon " + weapon + " | Task is " + TASK);
	}

	@Override
	public void assignWeapon(WEAPON weapon) {
		this.weapon = weapon;
	}
}