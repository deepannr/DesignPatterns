package com.designpatterns.structural.adapter.object.area;

interface Area {
	public double getArea(Rectangle rectangle);
}

class RectangleArea implements Area {
	Rectangle rectangle;
	
	@Override
	public double getArea(Rectangle r) {
		rectangle = r;
		return rectangle.length * rectangle.width;
	}
}