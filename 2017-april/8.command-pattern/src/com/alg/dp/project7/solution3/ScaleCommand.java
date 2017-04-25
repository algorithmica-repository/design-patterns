package com.alg.dp.project7.solution3;

public class ScaleCommand extends AbstractCommand {
	private int j;
	
	public ScaleCommand(Square square, int j) {
		super(square);
		this.j = j;
	}
		
	public void undo() {
		square.scale_undo(j);
	}
}
