package com.alg.oodesign.solution2;

public abstract class AbstractCommand {
	private String operation;
	protected Square square;
	
	public AbstractCommand(String operation, Square square) {
		super();
		this.operation = operation;
		this.square = square;
	}
	
	public  abstract  void execute();
	public abstract void unexecute();
}
