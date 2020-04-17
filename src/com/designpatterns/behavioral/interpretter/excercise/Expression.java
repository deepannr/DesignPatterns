package com.designpatterns.behavioral.interpretter.excercise;

interface Expression {
	int interpret(InterpretterContext context);
}

class AndTeriminalExpression implements Expression {
	private InputClass input;

	public AndTeriminalExpression(InputClass input) {
		this.input = input;
	}

	@Override
	public int interpret(InterpretterContext context) {
		return context.andInterpretter(input);
	}
}

class OrTeriminalExpression implements Expression {
	private InputClass input;

	public OrTeriminalExpression(InputClass input) {
		this.input = input;
	}

	@Override
	public int interpret(InterpretterContext context) {
		return context.orInterpretter(input);
	}
}