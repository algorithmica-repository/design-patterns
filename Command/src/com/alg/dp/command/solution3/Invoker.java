package com.alg.dp.command.solution3;

public class Invoker {
	private AbstractOperation operation;
	
	public void scale(Square square, int factor) {
		operation  = new ScaleOperation(square, factor);
		operation.execute();
	}
	
	public void move(Square square, int i, int j) {
		operation  = new MoveOperation(square, i, j);
		operation.execute();
	}
	
	public void undo() {
		operation.undo();
	}
	
	public void print(Square square) {
		new PrintOperation(square).execute();
	}
}
