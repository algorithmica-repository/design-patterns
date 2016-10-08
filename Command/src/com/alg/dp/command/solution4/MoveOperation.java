package com.alg.dp.command.solution4;

public class MoveOperation extends AbstractOperation {
	private int i;
	private int j;
	
	public MoveOperation(Square square, int i, int j) {
		this.i = i;
		this.j = j;
		this.square = square;
	}

	public void execute() {
		square.move(i, j);
	}

	public int getJ() {
		return j;
	}
	
	public void undo() {
		square.undomove(i, j);
	}
	
}
