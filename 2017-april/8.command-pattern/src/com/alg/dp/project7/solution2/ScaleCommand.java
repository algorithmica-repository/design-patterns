package com.alg.dp.project7.solution2;

public class ScaleCommand extends AbstractCommand {
	private int j;
	
	public ScaleCommand(String command, Square square, int j) {
		super(command, square);
		this.j = j;
	}
	
	public int getJ() {
		return j;
	}
}
