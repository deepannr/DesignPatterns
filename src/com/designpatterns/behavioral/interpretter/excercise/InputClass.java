package com.designpatterns.behavioral.interpretter.excercise;

class InputClass {
	private String operatorType;

	private int first;

	private int second;

	public InputClass(String operatorType, int first, int second) {
		this.operatorType = operatorType;
		this.first = first;
		this.second = second;
	}

	public String getOperatorType() {
		return operatorType;
	}

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}
}
