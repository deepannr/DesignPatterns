package com.designpatterns.behavioral.interpretter.excercise;

class InterpretterContext {
	public int andInterpretter(InputClass input) {
		return (input.getFirst() & input.getSecond());
	}
	
	public int orInterpretter(InputClass input) {
		return (input.getFirst() | input.getSecond());
	}
}