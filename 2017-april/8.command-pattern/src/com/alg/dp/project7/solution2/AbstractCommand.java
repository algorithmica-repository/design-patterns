package com.alg.dp.project7.solution2;

public abstract class AbstractCommand {
	private String command;
	private Square square;
	
	public AbstractCommand(String command, Square square) {
		this.command = command;
		this.square = square;
	}
	
	public String getCommand() {
		return command;
	}
	
	public Square getSquare() {
		return square;
	}
}
