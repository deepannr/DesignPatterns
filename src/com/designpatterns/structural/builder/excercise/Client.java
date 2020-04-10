package com.designpatterns.structural.builder.excercise;

public class Client {

	public static void main(String[] args) {
		Color green = new GreenColor();
		Color red = new RedColor();

		Shape greenTriangle = new Triangle(green);
		greenTriangle.draw(20);
		greenTriangle.modify(20, 2);
		
		Shape redTriangle = new Triangle(red);
		redTriangle.draw(15);
		redTriangle.modify(15, 3);
		
		Shape greenRectangle = new Rectangle(green);
		greenRectangle.draw(20);
		greenRectangle.modify(20, 2);
		
		Shape redRectangle = new Rectangle(red);
		redRectangle.draw(10);
		redRectangle.modify(10, 3);
	}
}
