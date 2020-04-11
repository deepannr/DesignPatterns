package com.designpatterns.structural.decorator.excercise;

abstract class ShapeDecorator implements ShapeComponent {
	protected ShapeComponent component;
	
	public ShapeDecorator(ShapeComponent component) {
		this.component = component;
	}
	
	@Override
	public void draw() {
		System.out.print("Decorator Class :: ");
	}
}

class BlueDecorator extends ShapeDecorator {
	public BlueDecorator(ShapeComponent component) {
		super(component);
	}
	
	@Override
	public void draw() {
		System.out.println("Draw with Blue Color");
	}
}

class GreenDecorator extends ShapeDecorator {
	public GreenDecorator(ShapeComponent component) {
		super(component);
	}
	
	@Override
	public void draw() {
		System.out.println("Draw with Green Color");
	}
}