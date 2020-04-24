package com.designpatterns.behavioral.template.house;

class Client {

	public static void main(String[] args) {
		System.out.println("---Wooden House---");
		HouseTemplate woodenHouse = new BuildWoodenHouse();
		woodenHouse.buildHouse();
		
		System.out.println("\n\n---Glass House---");
		HouseTemplate glassHouse = new BuildGlassHouse();
		glassHouse.buildHouse();
	}
}