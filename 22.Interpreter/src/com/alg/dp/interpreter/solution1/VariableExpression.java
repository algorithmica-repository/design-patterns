package com.alg.dp.interpreter.solution1;

public class VariableExpression implements INumericExpression {
	private String name;
	
	
	public VariableExpression(String name) {
		super();
		this.name = name;
	}


	@Override
	public int interpret(Context ctx) {
		// TODO Auto-generated method stub
		return ctx.lookup(name);
	}

}
