package com.alg.dp.project7.solution2;

public class MoveCommand extends AbstractCommand {
	private int j;
	private int k;
	
	public MoveCommand(String command, Square square, int j, int k) {
		super(command, square);
		this.j = j;
		this.k = k;
	}
	
	public int getJ() {
		return j;
	}
	
	public int getK() {
		return k;
	}
	
}
