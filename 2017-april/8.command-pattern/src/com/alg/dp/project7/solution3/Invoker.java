package com.alg.dp.project7.solution3;

public class Invoker {
	private AbstractCommand lastCommand;
	
	public void move(Square square, int j, int k) {
		lastCommand = new MoveCommand(square, j, k);
		square.move(j, k);
	}
	
	public void scale(Square square, int j) {
		lastCommand = new ScaleCommand(square, j);
		square.scale(j);
	}
	
	public void print(Square square) {
		System.out.println(square.toString());
	}
	
	public void undo() {
		if(lastCommand == null) {
			System.out.println("No command exist for undo");
			return;
		}
		lastCommand.undo();
		lastCommand = null;
	}

}
