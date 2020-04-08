package com.designpatterns.structural.adapter.clas;

public class Client {

	public static void main(String[] args) {
		IntegerInterface classAdapter = new ClassAdapter();
		System.out.println("Class Adapter:  " + classAdapter.getInteger());
		
		IntegerInterface objectAdapter = new ObjectAdapter(classAdapter);
		System.out.println("Object Adapter: " + objectAdapter.getInteger());
	}
}