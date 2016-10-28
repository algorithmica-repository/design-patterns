package com.alg.dp.command.solution4;

public class ScaleOperation extends AbstractOperation {
	private int factor;
	
	public ScaleOperation(Square square, int factor) {
		this.factor = factor;
		this.square = square;
	}

	public void execute() {
		square.scale(factor);
	}
	
	public void undo() {
		square.undoscale(factor);
	}
	
}