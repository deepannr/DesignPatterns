package com.designpatterns.structural.decorator.job;

abstract class Decorator extends Component {
	protected Component component;
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		System.out.println("From Abstract Decorator. Open for modification");
		component.operation();
	}
}

class ConcreteDecoratorState extends Decorator {
	public ConcreteDecoratorState(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		System.out.println("From ConcreteDecoratorState, Adding State ");
		addBehavior();
	}
	
	private void addBehavior() {
		System.out.println("	State is added...");
	}
}


class ConcreteDecoratorBehavior extends Decorator {
	public ConcreteDecoratorBehavior(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		System.out.println("From ConcreteDecoratorBehavior, Adding Behavior");
		addState();
	}
	
	private void addState() {
		System.out.println("	Behavior is added...");
	}
}