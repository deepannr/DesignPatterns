package com.designpatterns.behavioral.mediator.excercise;

abstract class AbstractBuyer {
	protected AuctionMediator mediator;
	
	protected String buyerName;
	
	protected int biddingPrice;

	public AbstractBuyer(AuctionMediator mediator, String buyerName, int biddingPrice) {
		super();
		this.mediator = mediator;
		this.buyerName = buyerName;
		this.biddingPrice = biddingPrice;
	}
	
	abstract void sendBiddingPrice();
	
	abstract void receiveWinner(String buyerName, int biddingPrice);

}


class BuyerImpl extends AbstractBuyer {
	public BuyerImpl(AuctionMediator mediator, String buyerName, int biddingPrice) {
		super(mediator, buyerName, biddingPrice);
	}

	@Override
	void receiveWinner(String buyerName, int biddingPrice) {
		System.out.println(buyerName + " won for price " + biddingPrice);
	}

	@Override
	void sendBiddingPrice() {
		System.out.println(this.buyerName + " set bidding for " + biddingPrice);
		mediator.findAuctionWinner();
	}
}