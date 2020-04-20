package com.designpatterns.behavioral.mediator.excercise;

class Client {

	public static void main(String[] args) {
		AuctionMediator mediator = new AuctionMediatorImpl();
		
		AbstractBuyer buyerA = new BuyerImpl(mediator, "BuyerA", 100);
		AbstractBuyer buyerB = new BuyerImpl(mediator, "BuyerB", 200);
		AbstractBuyer buyerC = new BuyerImpl(mediator, "BuyerC", 400);
		AbstractBuyer buyerD = new BuyerImpl(mediator, "BuyerD", 300);
		
		mediator.addBuyer(buyerA);
		mediator.addBuyer(buyerB);
		mediator.addBuyer(buyerC);
		mediator.addBuyer(buyerD);
		
		mediator.findAuctionWinner();
	}

}
