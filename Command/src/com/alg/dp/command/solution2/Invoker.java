package com.alg.dp.command.solution2;

public class Invoker {
	private AbstractOperation lastoperation;
	
	public void scale(Square square, int factor) {
		lastoperation  = new ScaleOperation(square, factor);
		square.scale(factor);
	}
	
	public void move(Square square, int i, int j) {
		lastoperation  = new MoveOperation(square, i, j);
		square.move(i, j);
	}
	
	public void undo() {
		
		if(lastoperation.getOperation().equals("scale")) {
			ScaleOperation operation = (ScaleOperation)lastoperation;
			lastoperation.getSquare().undoscale(operation.getFactor());
		}
		else if(lastoperation.getOperation().equals("move")) {
			MoveOperation operation = (MoveOperation)lastoperation;
			lastoperation.getSquare().undomove(operation.getI(), operation.getJ());
		}
		else
			System.out.println("Invalid operation");
	}
	
	public void print(Square square) {
		System.out.println(square);
	}
}
