package com.designpatterns.behavioral.command.excercise;

interface OrderInvoker {
	void execute();
}

class OrderInvokerImpl implements OrderInvoker {
	private OrderCommand command;
	
	public OrderInvokerImpl(OrderCommand command) {
		this.command = command;
	}

	@Override
	public void execute() {
		command.execute();
	}
}