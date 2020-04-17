package com.designpatterns.behavioral.interpretter.expression;

interface Expression {
	String interpret(InterpretterContext context);
}

class BinaryTeriminalExpression implements Expression {
	private int input;
	
	public BinaryTeriminalExpression(int input) {
		this.input = input;
	}

	@Override
	public String interpret(InterpretterContext context) {
		return context.IntToBinaryFormatter(input);
	}
}

class HexaTeriminalExpression implements Expression {
	private int input;
	
	public HexaTeriminalExpression(int input) {
		this.input = input;
	}

	@Override
	public String interpret(InterpretterContext context) {
		return context.IntToHexaFormatter(input);
	}
}