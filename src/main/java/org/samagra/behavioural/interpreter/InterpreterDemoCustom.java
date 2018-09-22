package org.samagra.behavioural.interpreter;

public class InterpreterDemoCustom {

	static Expression buildExpressionTree() {
		Expression e1 = new TerminalExpression("Lions");
		Expression e2 = new TerminalExpression("Tigers");
		Expression e3 = new TerminalExpression("Bears");
		Expression e4 = new AndExpression(e1,e2);
		Expression e5 = new OrExpression(e4,e3);
		return new AndExpression(e1,e5); 
	}
	public static void main(String[] args) {
		String context = "Lions";
		//String context = "Tigers";
		Expression define = buildExpressionTree();
		System.out.println(define.interpret("Samagra "));
	}
}
