package com.designpatterns.behavioral.interpretter.excercise;

class Client {
	private InterpretterContext context;

	public Client(InterpretterContext context) {
		this.context = context;
	}

	private int interpret(InputClass input) {
		Expression expression = null;
		if ("And".equalsIgnoreCase(input.getOperatorType())) {
			expression = new AndTeriminalExpression(input);
		} else if ("Or".equalsIgnoreCase(input.getOperatorType())) {
			expression = new OrTeriminalExpression(input);
		} else {
			return 0;
		}

		return expression.interpret(context);
	}

	public static void main(String[] args) {
		InputClass andOperator = new InputClass("AND", 1, 0);
		InputClass orOperator = new InputClass("OR", 1, 0);
		Client client = new Client(new InterpretterContext());

		System.out.println(andOperator.getFirst() + " " + andOperator.getOperatorType() + " " + andOperator.getSecond()
				+ " = " + client.interpret(andOperator));
		System.out.println(orOperator.getFirst() + " " + orOperator.getOperatorType() + " " + orOperator.getSecond()
				+ " = " + client.interpret(orOperator));
	}
}
