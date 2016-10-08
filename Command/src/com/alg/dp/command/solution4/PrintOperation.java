package com.alg.dp.command.solution4;

public class PrintOperation extends AbstractOperation {
	
	public PrintOperation(Square square) {
		this.square = square;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void execute() {
		System.out.println(square);
	}

}
