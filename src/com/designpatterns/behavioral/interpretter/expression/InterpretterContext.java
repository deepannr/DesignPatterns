package com.designpatterns.behavioral.interpretter.expression;

class InterpretterContext {
	public String IntToBinaryFormatter(int input) {
		return Integer.toBinaryString(input);
	}

	public String IntToHexaFormatter(int input) {
		return Integer.toHexString(input);
	}
}