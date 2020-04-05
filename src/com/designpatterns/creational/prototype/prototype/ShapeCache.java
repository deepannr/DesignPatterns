package com.designpatterns.creational.prototype.prototype;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

	public static Shape getShape(String shapeId) {
		Shape shape = shapeMap.get(shapeId);
		System.out.println("Non Cloned Shape : " + shape);
		Shape clonedShape = (Shape) shape.clone();
		System.out.println("Cloned Shape : " + clonedShape);
		return clonedShape;
	}
	
	public static void loadCache() {
		Rectangle rectangle = new Rectangle();
		rectangle.setId("1");
		shapeMap.put(rectangle.getId(), rectangle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
	}
}
