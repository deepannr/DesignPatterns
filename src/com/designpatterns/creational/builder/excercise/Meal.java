package com.designpatterns.creational.builder.excercise;

import java.util.List;
import java.util.ArrayList;

public class Meal {
	private List<Item> items;
	
	public Meal() {
		items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void getPrice() {
		float price = 0f;
		for(Item item:items) {
			price += item.getPrice();
		}
		System.out.println("Total Price: "+ price);
	}
	
	public void getItems() {
		System.out.println("All Items");
		items.forEach(item -> {
			System.out.println("Item Name: " + item.getName());
			System.out.println("Price: " + item.getPrice());
			System.out.println("Packing: " + item.getPacking().packing());
		});
	}
}
