package com.designpatterns.structural.flyweight.intrinsic;

/*
 * This behaves like a single pattern, create only one key for each category.
 */

class Client {

	public static void main(String[] args) {
		RobotFactory factory = new RobotFactory();
		try {
			System.out.println("---Small Robots---");
			Robot small = factory.getRobotFromFactory(ROBOTCATEGORY.SMALL);
			small.name();
			
			for (int i=0; i<3; ++i) {
				small = factory.getRobotFromFactory(ROBOTCATEGORY.SMALL);
				small.name();
			}
			
			System.out.println("Total Robots Created: " + factory.robotsCreated());
			
			System.out.println("\n---Small Robots---");
			Robot big = factory.getRobotFromFactory(ROBOTCATEGORY.SMALL);
			small.name();
			
			for (int i=0; i<3; ++i) {
				big = factory.getRobotFromFactory(ROBOTCATEGORY.BIG);
				big.name();
			}
			System.out.println("Total Robots Created: " + factory.robotsCreated());
			
			System.out.println("\n---Invalid Robots---");
			Robot invalid = factory.getRobotFromFactory(ROBOTCATEGORY.INVALID);
			invalid.name();
			
			System.out.println("Total Robots Created: " + factory.robotsCreated());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
