package com.designpatterns.behavioral.visitor.cart;

class Client {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Book(126, "B123"), new Book(15, "B5123"),
				new Fruit(100, 5, "Banana"), new Fruit(40, 20, "Apple") };

		int sum = calculatePrice(items);

		System.out.println("Total Cost: " + sum);
	}

	private static int calculatePrice(ItemElement[] elements) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

		int sum = 0;
		for (ItemElement element : elements) {
			sum += element.acceptVisitor(visitor);
		}
		return sum;
	}

}
