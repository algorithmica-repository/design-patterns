package com.alg.dp.project7.solution4;

public class PrintCommand extends AbstractCommand {

	public PrintCommand(Square square) {
		super(square);
	}
	
	@Override
	void undo() {
		// TODO Auto-generated method stub

	}

	@Override
	void execute() {
		System.out.println(square.toString());
	}
	
	public boolean undoable() {
		return false;
	}

}
