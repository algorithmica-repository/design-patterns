package com.alg.dp.command.solution2;

public class ScaleOperation extends AbstractOperation {
	private int factor;
	
	public ScaleOperation(Square square, int factor) {
		operation = "scale";
		this.factor = factor;
		this.square = square;
	}

	public int getFactor() {
		return factor;
	}
	
	
}