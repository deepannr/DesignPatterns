package com.designpatterns.behavioral.chainofresponsibility.excercise;

import java.util.Scanner;

class Client {
	private ErrorHandler errorHandler;
	
	public Client() {
		errorHandler = new FaxErrorHandler();
		ErrorHandler mailHandler = new EmailErrorHandler();
		
		errorHandler.setNextChain(mailHandler);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Client processor = new Client();
		
		while (true) {
			System.out.println("Enter a text for parser: ");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String inputText = input.nextLine();
			if (!inputText.contains("fax") && !inputText.contains("email")) {
				System.out.println("Invalid Parser for: " + inputText);
				return;
			}

			processor.errorHandler.processErrorHandler(new ErrorResponse(inputText));
		}
	}
}
