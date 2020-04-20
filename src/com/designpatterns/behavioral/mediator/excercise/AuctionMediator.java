package com.designpatterns.behavioral.mediator.excercise;

import java.util.ArrayList;
import java.util.List;

interface AuctionMediator {
	void findAuctionWinner();

	void addBuyer(AbstractBuyer buyer);
}

class AuctionMediatorImpl implements AuctionMediator {
	private List<AbstractBuyer> buyers;

	public AuctionMediatorImpl() {
		buyers = new ArrayList<>();
	}

	@Override
	public void findAuctionWinner() {
		AbstractBuyer winner = null;
		int maxBidPrice = 0;

		for (AbstractBuyer buyer : buyers) {
			System.out.println(buyer.buyerName + " Did Bidding for " + buyer.biddingPrice);
			if (buyer.biddingPrice > maxBidPrice) {
				maxBidPrice = buyer.biddingPrice;
				winner = buyer;
			}
		}

		for (AbstractBuyer buyer : buyers) {
			if (winner != buyer) {
				buyer.receiveWinner(winner.buyerName, maxBidPrice);
			}
		}
	}

	@Override
	public void addBuyer(AbstractBuyer buyer) {
		this.buyers.add(buyer);
	}
}