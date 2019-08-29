package com.alg.oodesign.solution4;

import java.util.Stack;

public class CommandManager {
	private Stack<AbstractCommand> undo_history;
	private Stack<AbstractCommand> redo_history;
	
	public CommandManager() {
		undo_history = new Stack<AbstractCommand>();
		redo_history = new Stack<AbstractCommand>();
	}
	public void invoke(AbstractCommand cmd) {
		cmd.execute();
		undo_history.push(cmd);
	}
		
	public void undo() {
		if(undo_history.isEmpty()) {
			System.out.println("no history"); 
			return; 
		}
		AbstractCommand command = undo_history.pop();
		command.unexecute();
		redo_history.push(command);
	}
	
	public void redo() {
		if(redo_history.isEmpty()) {
			System.out.println("no history"); 
			return; 
		}
		AbstractCommand command = redo_history.pop();
		command.execute();
		undo_history.push(command);
	}
	
	public void display(Square s) {
		System.out.println(s);
	}
}
