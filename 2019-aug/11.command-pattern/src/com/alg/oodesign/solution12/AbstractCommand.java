package com.alg.oodesign.solution12;

public abstract class AbstractCommand {
	private String operation;
	protected Square square;
	
	public AbstractCommand(String operation, Square square) {
		super();
		this.operation = operation;
		this.square = square;
	}

	public String getOperation() {
		return operation;
	}

	public Square getSquare() {
		return square;
	}		

}
