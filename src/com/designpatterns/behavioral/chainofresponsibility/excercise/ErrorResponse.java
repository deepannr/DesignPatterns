package com.designpatterns.behavioral.chainofresponsibility.excercise;

class ErrorResponse {
	private String errorMessage;

	public ErrorResponse(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
