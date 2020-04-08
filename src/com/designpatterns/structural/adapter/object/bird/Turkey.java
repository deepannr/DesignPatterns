package com.designpatterns.structural.adapter.object.bird;

interface Turkey {
	void gobble();
	void fly();
}

class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Turkey Gobbles..");
	}

	@Override
	public void fly() {
		System.out.println("Turkey flies short distance");
	}
}