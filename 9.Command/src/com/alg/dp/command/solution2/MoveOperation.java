package com.alg.dp.command.solution2;

public class MoveOperation extends AbstractOperation {
	private int i;
	private int j;
	
	public MoveOperation(Square square, int i, int j) {
		operation = "move";
		this.i = i;
		this.j = j;
		this.square = square;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
	
	
}
