package com.designpatterns.behavioral.command.excercise;

interface StockReceiver {
	void buyStock();
	
	void sellStock();
}

class BSEStockExchangeReceiver implements StockReceiver {
	@Override
	public void buyStock() {
		System.out.println("Bought BSE Stocks");
	}

	@Override
	public void sellStock() {
		System.out.println("Sold BSE Stocks");
	}
}

class NSEStockExchangeReceiver implements StockReceiver {
	@Override
	public void buyStock() {
		System.out.println("Buying NSE Stocks");
	}

	@Override
	public void sellStock() {
		System.out.println("Selling NSE Stocks");
	}
}