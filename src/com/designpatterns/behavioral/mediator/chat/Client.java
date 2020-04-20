package com.designpatterns.behavioral.mediator.chat;

class Client {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		
		AbstractCollegue sender = new ConcreteCollegue(mediator, "Unicorn");
		AbstractCollegue receiverA = new ConcreteCollegue(mediator, "Shine");
		AbstractCollegue receiverB = new ConcreteCollegue(mediator, "Discover");
		AbstractCollegue receiverC = new ConcreteCollegue(mediator, "ThunderBird");
		
		mediator.addCollegue(sender);
		mediator.addCollegue(receiverA);
		mediator.addCollegue(receiverB);
		mediator.addCollegue(receiverC);
		
		sender.send("Test Message");
	}
}
