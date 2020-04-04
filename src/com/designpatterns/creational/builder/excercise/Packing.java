package com.designpatterns.creational.builder.excercise;

public interface Packing {
	String packing();
}

class Wrapper implements Packing {
	@Override
	public String packing() {
		return "Wrapper Packing";
	}
}

class Bottle implements Packing {
	@Override
	public String packing() {
		return "Bottle Packing";
	}
}