package com.alg.dp.interpreter.solution1;

public class ConstantExpression implements INumericExpression {
	private int value;
	
	
	public ConstantExpression(int value) {
		super();
		this.value = value;
	}


	@Override
	public int interpret(Context ctx) {
		// TODO Auto-generated method stub
		return value;
	}

}
