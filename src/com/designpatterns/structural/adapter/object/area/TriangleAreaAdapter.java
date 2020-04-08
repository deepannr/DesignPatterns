package com.designpatterns.structural.adapter.object.area;

public class TriangleAreaAdapter implements Area {
	Area area;
	Triangle triangle;
	Rectangle rectangle;
	
	public TriangleAreaAdapter(Triangle localTriangle) {
		triangle = localTriangle;
	}

	@Override
	public double getArea(Rectangle localRectangle) {
		area = new RectangleArea();
		
		rectangle = localRectangle;
		rectangle.length = triangle.base;
		rectangle.width = triangle.height * 0.5;
		return area.getArea(rectangle);
	}
}
