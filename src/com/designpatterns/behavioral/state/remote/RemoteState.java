package com.designpatterns.behavioral.state.remote;

interface RemoteState {
	void handleToggleSwitch(TVContext context);
}

class OnState implements RemoteState {
	@Override
	public void handleToggleSwitch(TVContext context) {
		System.out.println("I'm in on state so going to off");
		context.setState(new OffState());
	}
}

class OffState implements RemoteState {
	@Override
	public void handleToggleSwitch(TVContext context) {
		System.out.println("I'm in off state so going to on");
		context.setState(new OnState());
	}
}