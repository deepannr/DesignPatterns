package com.designpatterns.behavioral.command.excercise;

import java.util.Scanner;

class Client {

	public static void main(String[] args) {
		System.out.println("Enter BSE or NSE stock: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String stockType = input.nextLine();

		// Create receiver
		StockReceiver receiver = OrderInvokerUtil.getStockReceiver(stockType);

		System.out.println("Buying " + stockType + " Stocks");

		// Create command with the associated receiver
		OrderCommand buyCommand = new BuyStockCommand(receiver);

		// Create invoker to associate with the command
		OrderInvoker buyInvoker = new OrderInvokerImpl(buyCommand);

		buyInvoker.execute();

		System.out.println("\nSelling " + stockType + " Stocks");

		OrderCommand sellCommand = new BuyStockCommand(receiver);

		OrderInvoker sellInvoker = new OrderInvokerImpl(sellCommand);

		sellInvoker.execute();
	}
}
