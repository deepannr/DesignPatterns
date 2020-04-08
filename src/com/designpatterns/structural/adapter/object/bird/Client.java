package com.designpatterns.structural.adapter.object.bird;

public class Client {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		System.out.println("---Turkey---");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\n---Duck---");
		Duck duck = new MallardDuck();
		testDuck(duck);
		
		System.out.println("\n---Turkey Adapter---");
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		testDuck(turkeyAdapter);
	}
	
	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
