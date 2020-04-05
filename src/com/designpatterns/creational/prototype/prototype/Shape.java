package com.designpatterns.creational.prototype.prototype;

/**
 * Base Class should implements Clonable interface. Here Clone method is present
 * in the parent abstract class and don't need to inherit in any sub class.
 * 
 * @author ab75812
 *
 */

public abstract class Shape implements Cloneable {
	private String id;

	protected String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	abstract void draw();

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ce) {
			ce.printStackTrace();
		}

		return clone;
	}
}

class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	void draw() {
		System.out.println("Inside Draw Method of " + type);

	}
}

class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	void draw() {
		System.out.println("Inside Draw Method of " + type);

	}
}