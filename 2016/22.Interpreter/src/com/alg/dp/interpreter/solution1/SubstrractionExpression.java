package com.alg.dp.interpreter.solution1;

public class SubstrractionExpression implements INumericExpression {
	private INumericExpression left, right;
	
	
	public SubstrractionExpression(INumericExpression left,
			INumericExpression right) {
		super();
		this.left = left;
		this.right = right;
	}


	@Override
	public int interpret(Context ctx) {
		// TODO Auto-generated method stub
		return left.interpret(ctx) - right.interpret(ctx);
	}

}
