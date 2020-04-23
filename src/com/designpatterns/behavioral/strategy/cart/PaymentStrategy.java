package com.designpatterns.behavioral.strategy.cart;

interface PaymentStrategy {
	void payment(int amount);
}

class CreditCardPaymentStrategy implements PaymentStrategy {
	private int cardNumber;
	private int expiryMonth;
	private int expiryYear;
	private int cvv;

	public CreditCardPaymentStrategy(int cardNumber, int expiryMonth, int expiryYear, int cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cvv = cvv;
	}

	@Override
	public void payment(int amount) {
		System.out.println("Paying amount " + amount + " Using Card Number: " + cardNumber + " Expiry Month : "
				+ expiryMonth + " Year: " + expiryYear + " with CVV: " + cvv);
	}
}

class PayPalPaymentStrategy implements PaymentStrategy {
	private String mailAddress;
	private String password;

	public PayPalPaymentStrategy(String mailAddress, String password) {
		super();
		this.mailAddress = mailAddress;
		this.password = password;
	}

	@Override
	public void payment(int amount) {
		System.out.println("Paying amount " + amount + " Through PayPal with email id: " + mailAddress
				+ " with password: " + password);
	}
}