package com.alg.dp.project7.solution3;

public abstract class AbstractCommand {
	protected Square square;
	
	public AbstractCommand(Square square) {
		this.square = square;
	}
	
	public Square getSquare() {
		return square;
	}
	
	abstract void undo();

}
