package com.designpatterns.behavioral.template.excercise;

class Client {

	public static void main(String[] args) {
		System.out.println("---In Store Order---");
		OrderTemplate inStore = new InStoreOrder();
		inStore.processOrder();

		System.out.println("\n\n---Online Order---");
		OrderTemplate online = new OnlineOrder();
		online.processOrder();
	}
}