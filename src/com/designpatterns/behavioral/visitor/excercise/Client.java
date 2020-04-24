package com.designpatterns.behavioral.visitor.excercise;

class Client {

	public static void main(String[] args) {
		System.out.println("---Parcel A---");
		ItemElement[] packageA = new ItemElement[] { new Book(3), new CD(2), new DVD(5) };
		System.out.println("Postage Fare: " + calculateShippingCost(packageA));

		System.out.println("\n---Parcel B---");
		ItemElement[] packageB = new ItemElement[] { new Book(6), new CD(7), new DVD(4) };
		System.out.println("Postage Fare: " + calculateShippingCost(packageB));

		System.out.println("\n---Parcel C---");
		ItemElement[] packageC = new ItemElement[] { new Book(1), new CD(1), new DVD(1) };
		System.out.println("Postage Fare: " + calculateShippingCost(packageC));
	}

	private static double calculateShippingCost(ItemElement[] items) {
		PostageFareVisitor visitor = new PostageFareVisitorImpl();
		double postageCost = 0;
		for (ItemElement item : items) {
			postageCost += item.acceptVisitor(visitor);
		}
		if (postageCost >= 30) {
			System.out.println("Postage Cost is Rupees: " + postageCost + " free Shipping throughout India.");
		} else if (postageCost >= 20) {
			System.out.println("Postage Cost is Rupees: " + postageCost + " free Shipping throughout TamilNadu.");
		} else {
			System.out.println("Postage Cost is Rupees: " + postageCost + " and no free shipping.");
		}
		return postageCost;
	}
}
