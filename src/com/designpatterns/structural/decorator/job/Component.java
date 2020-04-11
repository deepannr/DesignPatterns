package com.designpatterns.structural.decorator.job;

abstract class Component {
	public abstract void operation();
}

class ConcreteComponent extends Component {

	@Override
	public void operation() {
		System.out.println("From Concrete Component. Closed for Modification");
	}
}
