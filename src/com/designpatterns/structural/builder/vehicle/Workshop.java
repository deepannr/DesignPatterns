package com.designpatterns.structural.builder.vehicle;

abstract class Workshop {
	abstract void work();
}

class Produce extends Workshop {
	@Override
	void work() {
		System.out.print("Produced ");
	}
}

class Assemble extends Workshop {
	@Override
	void work() {
		System.out.println("And Assembled");
	}
}
