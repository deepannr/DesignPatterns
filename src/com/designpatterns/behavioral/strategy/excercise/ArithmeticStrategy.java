package com.designpatterns.behavioral.strategy.excercise;

interface ArithmeticStrategy {
	int doOperation();
}

class AddStrategy implements ArithmeticStrategy {
	private int first;
	private int second;

	public AddStrategy(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public int doOperation() {
		return first + second;
	}
}

class SubstractStrategy implements ArithmeticStrategy {
	private int first;
	private int second;

	public SubstractStrategy(int first, int second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public int doOperation() {
		return first - second;
	}
}

class MultiplyStrategy implements ArithmeticStrategy {
	private int first;
	private int second;

	public MultiplyStrategy(int first, int second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public int doOperation() {
		return first * second;
	}
}