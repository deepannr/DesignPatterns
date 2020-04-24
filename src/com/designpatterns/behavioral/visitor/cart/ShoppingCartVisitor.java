package com.designpatterns.behavioral.visitor.cart;

interface ShoppingCartVisitor {
	int visitItem(Book book);

	int visitItem(Fruit fruit);
}

class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
	@Override
	public int visitItem(Book book) {
		int bookCost = 0;
		if (book.getPrice() >= 50) {
			bookCost = book.getPrice() - 5;
		} else {
			bookCost = book.getPrice();
		}
		System.out.println("Book: " + book.getIsbnNumber() + " Cost: " + bookCost);
		return bookCost;
	}

	@Override
	public int visitItem(Fruit book) {
		int fruitCost = 0;
		fruitCost = book.getPricePerKg() * book.getWeight();
		System.out.println("Fruit: " + book.getName() + " Cost: " + fruitCost);
		return fruitCost;
	}
}