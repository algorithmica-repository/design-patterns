package com.alg.dp.project7.solution4;

public abstract class AbstractCommand {
	protected Square square;
	
	public AbstractCommand(Square square) {
		this.square = square;
	}
	
	public Square getSquare() {
		return square;
	}
	
	abstract void undo();
	abstract void execute();
	public boolean undoable() {
		return true;
	}

}
