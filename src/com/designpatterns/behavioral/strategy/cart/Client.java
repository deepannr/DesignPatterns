package com.designpatterns.behavioral.strategy.cart;


/**
 * Here Client should know which strategy to be used.
 *
 */
class Client {

	public static void main(String[] args) {
		ShoppingCartContext context = new ShoppingCartContext();
		
		Item milk = new Item("m234", 35);
		Item bowl = new Item("b234", 70);
		
		context.addItem(milk);
		context.addItem(bowl);
		
		PaymentStrategy cardPay = new CreditCardPaymentStrategy(12345, 12, 2029, 123);
		context.pay(cardPay);
		
		PaymentStrategy payPalPay = new PayPalPaymentStrategy("dee@gmail.com", "pass");
		
		context.pay(payPalPay);
	}
}
