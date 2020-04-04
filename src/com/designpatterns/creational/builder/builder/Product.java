package com.designpatterns.creational.builder.builder;

import java.util.LinkedList;

public class Product {
	private LinkedList<String> parts;
	
	public Product() {
		parts = new LinkedList<>();
	}
	
//	public void add(String part) {
//		parts.add(part);
//	}
	
	public void show() {
		parts.forEach(part -> System.out.println(part));
	}
}
