package com.alg.dp.command.solution4;

public abstract class AbstractOperation {
	protected Square square;
	protected String operation;
	
	public abstract void undo();
	
	public abstract void execute();
	
}
