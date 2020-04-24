package com.designpatterns.behavioral.visitor.cart;

interface ItemElement {
	int acceptVisitor(ShoppingCartVisitor visitor);
}

class Book implements ItemElement {
	private int price;
	private String isbnNumber;

	public Book(int price, String isbnNumber) {
		super();
		this.price = price;
		this.isbnNumber = isbnNumber;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int acceptVisitor(ShoppingCartVisitor visitor) {
		return visitor.visitItem(this);
	}
}

class Fruit implements ItemElement {
	private int pricePerKg;
	private int weight;
	private String name;

	public Fruit(int pricePerKg, int weight, String name) {
		super();
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public int acceptVisitor(ShoppingCartVisitor visitor) {
		return visitor.visitItem(this);
	}
}