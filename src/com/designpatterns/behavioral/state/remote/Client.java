package com.designpatterns.behavioral.state.remote;

/*
 * Here Context request for an action.
 * State fulfil or handle the action.
 */

class Client {

	public static void main(String[] args) {
		System.out.println("State Pattern Demo");

		RemoteState initialState = new OffState();
		TVContext context = new TVContext(initialState);

		// Toggle State to On
		context.requestPressButton();

		// Toggle State to Off
		context.requestPressButton();
	}
}
