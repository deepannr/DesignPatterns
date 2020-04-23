package com.designpatterns.behavioral.state.remote;

class TVContext {
	private RemoteState state;

	public TVContext(RemoteState state) {
		super();
		this.state = state;
	}

	public RemoteState getState() {
		return state;
	}

	public void setState(RemoteState state) {
		this.state = state;
	}

	public void requestPressButton() {
		state.handleToggleSwitch(this);
	}
}
