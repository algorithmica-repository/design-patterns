package com.alg.oodesign.solution12;

import java.util.Stack;

public class CommandManager {
	private Stack<AbstractCommand> undo_history;
	private Stack<AbstractCommand> redo_history;
	
	public CommandManager() {
		undo_history = new Stack<AbstractCommand>();
		redo_history = new Stack<AbstractCommand>();
	}
	public void move(Square s, int i, int j) {
		s.move(i, j);
		undo_history.push(new MoveCommand(s, i, j));
	}
	
	public void scale(Square s, int k) {
		s.scale(k);
		undo_history.push(new ScaleCommand(s, k));
	}
	
	public void undo() {
		if(undo_history.isEmpty()) {
			System.out.println("no history"); 
			return; 
		}
		AbstractCommand command = undo_history.pop();
		if(command.getOperation().equals("move")) {
			MoveCommand  mcommand = (MoveCommand)command;
			command.getSquare().unmove(mcommand.getI(), mcommand.getJ());
		} else if(command.getOperation().equals("scale")) {
			ScaleCommand  mcommand = (ScaleCommand)command;
			command.getSquare().unscale(mcommand.getK());
		} else 
			System.out.println("Invalid  operation");
		redo_history.push(command);
	}
	
	public void redo() {
		if(redo_history.isEmpty()) {
			System.out.println("no history"); 
			return; 
		}
		AbstractCommand command = redo_history.pop();
		if(command.getOperation().equals("move")) {
			MoveCommand  mcommand = (MoveCommand)command;
			command.getSquare().move(mcommand.getI(), mcommand.getJ());
		} else if(command.getOperation().equals("scale")) {
			ScaleCommand  mcommand = (ScaleCommand)command;
			command.getSquare().scale(mcommand.getK());
		} else 
			System.out.println("Invalid  operation");
	
		undo_history.push(command);
	}
	
	public void display(Square s) {
		System.out.println(s);
	}
}
