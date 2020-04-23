package com.designpatterns.behavioral.state.excercise;

class PhoneContext {
	private PhoneState state;

	public PhoneContext(PhoneState state) {
		super();
		this.state = state;
	}

	public PhoneState getState() {
		return state;
	}

	public void setState(PhoneState state) {
		this.state = state;
	}
	
	public void requestPhoneState() {
		state.handleState(this);
	}
}
