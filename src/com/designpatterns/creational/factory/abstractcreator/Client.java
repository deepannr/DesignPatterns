package com.designpatterns.creational.factory.abstractcreator;


/**
 * Here in this Abstract Creator each factory is sub classed and too many classes are there.
 * @author ab75812
 *
 */
public class Client {
	public static void main(String[] args) {
		/**
		 * Here Client don't know about the factory method as shape method returns the factory.
		 * RectangleFactory.getFactory method is invisible to the client.
		 */
		Shape rectShape = new RectangleFactory().getShape();
		rectShape.draw();
		
		Shape squareShape = new SquareFactory().getShape();
		squareShape.draw();
	}
}
