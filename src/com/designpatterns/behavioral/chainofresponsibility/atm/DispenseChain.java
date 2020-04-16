package com.designpatterns.behavioral.chainofresponsibility.atm;

interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency currency);
}

class Dispense500Rupees implements DispenseChain {
	private DispenseChain nextChain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 500) {
			int numberOfNotes = currency.getAmount() / 500;
			int remainder = currency.getAmount() % 500;
			System.out.println("Dispensed " + numberOfNotes + " 500 rupees notes");
			
			if(remainder != 0) {
				this.nextChain.dispense(new Currency(remainder));
			}
		} else {
			this.nextChain.dispense(currency);
		}
	}
}

class Dispense200Rupees implements DispenseChain {
	private DispenseChain nextChain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 200) {
			int numberOfNotes = currency.getAmount() / 200;
			int remainder = currency.getAmount() % 200;
			System.out.println("Dispensed " + numberOfNotes + " 200 rupees notes");
			
			if(remainder != 0) {
				this.nextChain.dispense(new Currency(remainder));
			}
		} else {
			this.nextChain.dispense(currency);
		}
	}
}

class Dispense100Rupees implements DispenseChain {
	private DispenseChain nextChain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 100) {
			int numberOfNotes = currency.getAmount() / 100;
			int remainder = currency.getAmount() % 100;
			System.out.println("Dispensed " + numberOfNotes + " 100 rupees notes");
			
			if(remainder != 0) {
				this.nextChain.dispense(new Currency(remainder));
			}
		} else {
			this.nextChain.dispense(currency);
		}
	}
}