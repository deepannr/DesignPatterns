package com.designpatterns.behavioral.strategy.excercise;

class ArithmenticContext {
	int executeStrategy(ArithmeticStrategy strategy) {
		return strategy.doOperation();
	}
}
