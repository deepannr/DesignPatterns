package com.designpatterns.structural.builder.excercise;

interface Color {
	void fillWithColor(int border);

}

class RedColor implements Color {
	@Override
	public void fillWithColor(int border) {
		System.out.println("Fill Red Color with border inch " + border);
	}
}

class GreenColor implements Color {
	@Override
	public void fillWithColor(int border) {
		System.out.println("Fill Green Color with border inch " + border);
	}
}