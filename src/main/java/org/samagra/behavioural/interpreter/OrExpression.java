package org.samagra.behavioural.interpreter;

public class OrExpression implements Expression {

	Expression expr1;
	Expression expr2;

	public OrExpression(Expression expr1, Expression expr2) {
		super();
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) || expr2.interpret(context);
	}

}
