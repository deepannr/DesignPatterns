package com.designpatterns.behavioral.chainofresponsibility.excercise;

interface ErrorHandler {
	void processErrorHandler(ErrorResponse error);
	
	void setNextChain(ErrorHandler errorHandler);
}

class FaxErrorHandler implements ErrorHandler {
	ErrorHandler errorHandler;

	@Override
	public void processErrorHandler(ErrorResponse error) {
		if (error.getErrorMessage().contains("fax")) {
			System.out.println("Error Handling for FAX messages");
		} else {
			this.errorHandler.processErrorHandler(error);
		}
	}

	@Override
	public void setNextChain(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}
}

class EmailErrorHandler implements ErrorHandler {
	ErrorHandler errorHandler;

	@Override
	public void processErrorHandler(ErrorResponse error) {
		if (error.getErrorMessage().contains("email")) {
			System.out.println("Error Handling for Email messages");
		} else {
			this.errorHandler.processErrorHandler(error);
		}
	}

	@Override
	public void setNextChain(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}
}