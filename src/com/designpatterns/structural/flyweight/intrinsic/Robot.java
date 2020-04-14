package com.designpatterns.structural.flyweight.intrinsic;

interface Robot {
	void name();
}

class SmallRobot implements Robot {

	@Override
	public void name() {
		System.out.println("Small Robot");
	}
}

class BigRobot implements Robot {

	@Override
	public void name() {
		System.out.println("Big Robot");
	}
}