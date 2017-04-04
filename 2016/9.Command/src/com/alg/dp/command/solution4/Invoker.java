package com.alg.dp.command.solution4;

public class Invoker {
	private AbstractOperation operation;
	
	public void invoke(AbstractOperation operation) {
		this.operation = operation;
		operation.execute();
	}
		
	public void undo() {
		operation.undo();
	}
	
	public void print(Square square) {
		new PrintOperation(square).execute();
	}
}
