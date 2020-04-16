package com.designpatterns.behavioral.command.excercise;

interface OrderCommand {
	void execute();
}

class BuyStockCommand implements OrderCommand {
	private StockReceiver stock;
	
	public BuyStockCommand(StockReceiver stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buyStock();
	}
}

class SellStockCommand implements OrderCommand {
	private StockReceiver stock;
	
	public SellStockCommand(StockReceiver stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sellStock();
	}
}