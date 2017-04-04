package com.alg.dp.interpreter.solution1;

public class Driver {

	public static void main(String[] args) {
		Context ctx = new Context();
		ctx.assign("x", 5);
		ctx.assign("y", 10);
		ctx.assign("z", 3);
		
		INumericExpression expr = new SumExpression(
										new SumExpression(
												new MultiplicationExpression(
														new VariableExpression("x"), 
														new ConstantExpression(2)
												), 
												new SubstrractionExpression(
														new VariableExpression("y"), 
														new ConstantExpression(3)
												)
											), 
											new VariableExpression("z"));
		System.out.println(expr.interpret(ctx));
	}

}
