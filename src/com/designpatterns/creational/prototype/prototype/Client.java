package com.designpatterns.creational.prototype.prototype;

public class Client {

	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape square = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape " + square.getType());
		square.draw();

		Shape rectangle = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape " + rectangle.getType());
		rectangle.draw();
	}
}