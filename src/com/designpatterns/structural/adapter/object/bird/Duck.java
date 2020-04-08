package com.designpatterns.structural.adapter.object.bird;

public interface Duck {
	void quack();
	void fly();
}

class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Duck Quacks");
	}

	@Override
	public void fly() {
		System.out.println("Duck Flies");
	}
}