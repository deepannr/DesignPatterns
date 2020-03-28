package com.designpatterns.creational.absfactory.creator;

public class Client {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(Constants.SHAPE);
		AbstractFactory colorFactory = FactoryProducer.getFactory(Constants.COLOR);

		Shape sqShape = shapeFactory.getShape(Constants.SQUARE);
		sqShape.draw();
		
		Color blaColor = colorFactory.getColor(Constants.BLACK);
		blaColor.fill();
		
		Shape recShape = shapeFactory.getShape(Constants.RECTANGLE);
		recShape.draw();
		
		Color bluShape = colorFactory.getColor(Constants.BLUE);
		bluShape.fill();
	}
}
