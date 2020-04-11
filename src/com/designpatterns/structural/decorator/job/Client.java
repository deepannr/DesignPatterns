package com.designpatterns.structural.decorator.job;

public class Client {

	public static void main(String[] args) {
		Component concrete = new ConcreteComponent();
		concrete.operation();
		
		ConcreteDecoratorState decoratorState = new ConcreteDecoratorState(concrete);
		decoratorState.operation();
		
		ConcreteDecoratorBehavior decoratorBehivor = new ConcreteDecoratorBehavior(concrete);
		decoratorBehivor.operation();
	}

}
