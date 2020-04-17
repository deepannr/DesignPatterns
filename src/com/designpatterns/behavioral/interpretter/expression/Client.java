package com.designpatterns.behavioral.interpretter.expression;

class Client {
	private InterpretterContext context;

	public Client(InterpretterContext context) {
		this.context = context;
	}

	private String interpret(String string) {
		Expression expression = null;
		if (string.contains("Binary")) {
			expression = new BinaryTeriminalExpression(Integer.parseInt(string.substring(0, string.indexOf(" "))));
		} else if (string.contains("Hexa")) {
			expression = new HexaTeriminalExpression(Integer.parseInt(string.substring(0, string.indexOf(" "))));
		} else {
			return string;
		}

		return expression.interpret(context);
	}

	public static void main(String[] args) {
		String binary = "26 in Binary";
		String hexa = "26 in Hexa";
		
		Client client = new Client(new InterpretterContext());
		System.out.println(binary + " = " + client.interpret(binary));
		System.out.println(hexa + " = " + client.interpret(hexa));
	}
}
