package com.alg.dp.project7.solution3;

public class MoveCommand extends AbstractCommand {
	private int j;
	private int k;
	
	public MoveCommand(Square square, int j, int k) {
		super(square);
		this.j = j;
		this.k = k;
	}
	
	
	public void undo() {
		square.move_undo(j, k);
	}
}
