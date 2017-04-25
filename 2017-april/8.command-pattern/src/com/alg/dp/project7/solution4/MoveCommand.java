package com.alg.dp.project7.solution4;

public class MoveCommand extends AbstractCommand {
	private int j;
	private int k;
	
	public MoveCommand(Square square, int j, int k) {
		super(square);
		this.j = j;
		this.k = k;
	}
	
	public void execute() {
		square.move(j, k);
	}
	
	public void undo() {
		square.move_undo(j, k);
	}
}
