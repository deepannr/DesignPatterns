package com.designpatterns.behavioral.state.excercise;

interface PhoneState {
	void handleState(PhoneContext context);
}

class SilentState implements PhoneState {
	@Override
	public void handleState(PhoneContext context) {
		System.out.println("Now in Silent State, changing to Vibration State");
		context.setState(new VibrationState());
	}
}

class VibrationState implements PhoneState {
	@Override
	public void handleState(PhoneContext context) {
		System.out.println("Now in Vibration State, changing to Silent State");
		context.setState(new SilentState());
	}
}