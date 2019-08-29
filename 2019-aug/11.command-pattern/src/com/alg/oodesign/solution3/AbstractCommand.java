package com.alg.oodesign.solution3;

public abstract class AbstractCommand {
	private String operation;
	protected IShape shape;
	
	public AbstractCommand(String operation, IShape shape) {
		super();
		this.operation = operation;
		this.shape = shape;
	}
	
	public  abstract  void execute();
	public abstract void unexecute();
}
