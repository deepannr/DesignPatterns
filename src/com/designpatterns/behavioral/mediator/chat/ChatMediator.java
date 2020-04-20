package com.designpatterns.behavioral.mediator.chat;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
	void sendMessage(String message, AbstractCollegue user);

	void addCollegue(AbstractCollegue user);
}

class ChatMediatorImpl implements ChatMediator {
	private List<AbstractCollegue> collegues;

	public ChatMediatorImpl() {
		collegues = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, AbstractCollegue user) {
		for (AbstractCollegue collegue : this.collegues) {
			// message should not be received by the user sending it
			if (collegue != user) {
				collegue.receive(message);
			}
		}
	}

	@Override
	public void addCollegue(AbstractCollegue user) {
		this.collegues.add(user);
	}
}
