package com.designpatterns.behavioral.command.excercise;

class OrderInvokerUtil {
	public static StockReceiver getStockReceiver(String stockExchangeType) {
		if ("BSE".equalsIgnoreCase(stockExchangeType)) {
			return new BSEStockExchangeReceiver();
		} else {
			return new NSEStockExchangeReceiver();
		}
	}
}