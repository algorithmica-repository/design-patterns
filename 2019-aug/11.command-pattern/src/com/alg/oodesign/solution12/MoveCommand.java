package com.alg.oodesign.solution12;

public class MoveCommand extends AbstractCommand {
	private int i;
	private int j;
	
	public MoveCommand(Square square, int i, int j) {
		super("move", square);
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
	
	
	
}
