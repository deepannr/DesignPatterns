package com.designpatterns.dependencyinj;

/***
 * This class is example of hard dependency where main heavily depend on
 * ExampleServiceImpl class. If this class to be changed and the main method
 * also needs to be changed.
 * 
 * @author ab75812
 *
 */

class ExampleServiceImpl {
	void greet(String name) {
		System.out.println("Welcome " + name);
	}
}

public class HardDependency {

	public static void main(String[] args) {
		ExampleServiceImpl service = new ExampleServiceImpl();
		service.greet("Dee");
	}
}
