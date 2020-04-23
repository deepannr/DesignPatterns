package com.designpatterns.behavioral.strategy.cart;

import java.util.ArrayList;
import java.util.List;

class ShoppingCartContext {
	private List<Item> items;

	public ShoppingCartContext() {
		items = new ArrayList<>();
	}

	void addItem(Item item) {
		this.items.add(item);
	}

	void removeItem(Item item) {
		this.items.remove(item);
	}

	private int calculatePrice() {
		int sum = 0;
		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

/*
 * Here Strategy is not stored anywhere
 */
	void pay(PaymentStrategy strategy) {
		int amount = calculatePrice();
		strategy.payment(amount);
	}
}
