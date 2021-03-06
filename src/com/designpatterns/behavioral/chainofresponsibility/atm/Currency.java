package com.designpatterns.behavioral.chainofresponsibility.atm;

class Currency {
	private int amount;

	public Currency(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
}
