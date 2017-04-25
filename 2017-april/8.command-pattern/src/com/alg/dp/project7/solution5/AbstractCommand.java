package com.alg.dp.project7.solution5;

public abstract class AbstractCommand {
	protected Square square;
	
	public AbstractCommand(Square square) {
		this.square = square;
	}
	
	public Square getSquare() {
		return square;
	}
	
	public abstract void undo();
	public void redo() { 
		execute();
	}
	public abstract void execute();
	public boolean undoable() {
		return true;
	}

}
