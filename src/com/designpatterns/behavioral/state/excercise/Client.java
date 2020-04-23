package com.designpatterns.behavioral.state.excercise;

/*
 * Here Context request for an action.
 * State fulfil or handle the action.
 */

class Client {

	public static void main(String[] args) {
		System.out.println("---Initial State as Silent State---");
		PhoneState initialState = new SilentState();
		PhoneContext context = new PhoneContext(initialState);
		context.requestPhoneState();
		context.requestPhoneState();
		context.requestPhoneState();
		context.requestPhoneState();
	}
}