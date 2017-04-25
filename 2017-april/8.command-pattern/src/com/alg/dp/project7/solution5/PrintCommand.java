package com.alg.dp.project7.solution5;

public class PrintCommand extends AbstractCommand {

	public PrintCommand(Square square) {
		super(square);
	}
	
	public void undo() {
		// TODO Auto-generated method stub

	}

	public void execute() {
		System.out.println(square.toString());
	}
	
	public boolean undoable() {
		return false;
	}

}
