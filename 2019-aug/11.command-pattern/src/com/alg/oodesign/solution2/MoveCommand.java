package com.alg.oodesign.solution2;

public class MoveCommand extends AbstractCommand {
	private int i;
	private int j;
	
	public MoveCommand(Square square, int i, int j) {
		super("move", square);
		this.i = i;
		this.j = j;
	}

	@Override
	public void execute() {
		square.move(i, j);		
	}

	@Override
	public void unexecute() {
		square.unmove(i, j);		
	}
	
	
}
