package com.alg.oodesign.solution3;

public class MoveCommand extends AbstractCommand {
	private int i;
	private int j;
	
	public MoveCommand(IShape shape, int i, int j) {
		super("move", shape);
		this.i = i;
		this.j = j;
	}

	@Override
	public void execute() {
		shape.move(i, j);		
	}

	@Override
	public void unexecute() {
		shape.unmove(i, j);		
	}
	
	
}
