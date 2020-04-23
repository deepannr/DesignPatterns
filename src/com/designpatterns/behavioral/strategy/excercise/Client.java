package com.designpatterns.behavioral.strategy.excercise;

class Client {
	public static void main(String[] args) {
		ArithmenticContext context = new ArithmenticContext();
		int first = 10, second = 5;

		ArithmeticStrategy addition = new AddStrategy(first, second);
		System.out.println(first + " + " + second + " = " + context.executeStrategy(addition));

		ArithmeticStrategy substraction = new SubstractStrategy(first, second);
		System.out.println(first + " + " + second + " = " + context.executeStrategy(substraction));

		ArithmeticStrategy multiplication = new MultiplyStrategy(first, second);
		System.out.println(first + " + " + second + " = " + context.executeStrategy(multiplication));
	}
}
