package com.designpatterns.creational.absfactory.creator;

public interface Color {
	void fill();
}

class Black implements Color {

	@Override
	public void fill() {
		System.out.println("Fill with Black Color");
	}
}

class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Fill with Blue Color");
	}
}
