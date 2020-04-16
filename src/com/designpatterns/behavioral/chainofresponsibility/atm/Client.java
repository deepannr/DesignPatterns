package com.designpatterns.behavioral.chainofresponsibility.atm;

import java.util.Scanner;

class Client {
	private DispenseChain chain;

	public Client() {
		chain = new Dispense500Rupees();
		DispenseChain next200 = new Dispense200Rupees();
		DispenseChain next100 = new Dispense100Rupees();

		chain.setNextChain(next200);
		next200.setNextChain(next100);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Client atmDispense = new Client();
		while(true) {
			System.out.print("Enter amount to Dispense: ");
			Scanner input = new Scanner(System.in);
			int amount = input.nextInt();
			
			if (amount % 100 != 0) {
				System.out.println("Enter amount in multiples of 100");
				return;
			}
			atmDispense.chain.dispense(new Currency(amount));
		}
	}
}
