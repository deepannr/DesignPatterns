package com.designpatterns.behavioral.template.excercise;

abstract class OrderTemplate {
	public void processOrder() {
		doSelect();

		doPayment();

		giftWrapping();
		
		delivery();
	}

	abstract void doSelect();

	abstract void doPayment();

	abstract void delivery();

	void giftWrapping() {
		System.out.println("Gift not needed.");
	}
}

class OnlineOrder extends OrderTemplate {
	@Override
	void doSelect() {
		System.out.println("Selecting the items from the website");
	}

	@Override
	void doPayment() {
		System.out.println("Paying through credit card");
	}
	
	@Override
	void giftWrapping() {
		System.out.println("Gift is needed.");
	}

	@Override
	void delivery() {
		System.out.println("Delivering order to courier");
	}
}

class InStoreOrder extends OrderTemplate {
	@Override
	void doSelect() {
		System.out.println("Selecting the items from the shelf in the store");
	}

	@Override
	void doPayment() {
		System.out.println("Paying through cash at the store");
	}

	@Override
	void delivery() {
		System.out.println("Pick the order and walk away");
	}
}