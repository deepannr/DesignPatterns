package com.designpatterns.behavioral.mediator.chat;

abstract class AbstractCollegue {
	protected ChatMediator mediator;
	protected String name;

	public AbstractCollegue(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	abstract void send(String message);

	abstract void receive(String message);
}

class ConcreteCollegue extends AbstractCollegue {

	public ConcreteCollegue(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	void send(String message) {
		System.out.println("Sending message: " + message + " from Class: " + this.name);
		mediator.sendMessage(message, this);
	}

	@Override
	void receive(String message) {
		System.out.println(this.name + " Receiving message: " + message);
	}
}
