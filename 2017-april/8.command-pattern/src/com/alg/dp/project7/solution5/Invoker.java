package com.alg.dp.project7.solution5;

import java.util.Stack;

public class Invoker {
	private Stack<AbstractCommand> undo_commands;
	private Stack<AbstractCommand> redo_commands;

	public Invoker() {
		undo_commands = new Stack<AbstractCommand>();
		redo_commands = new Stack<AbstractCommand>();
	}
	
	public void execute(AbstractCommand command) {
		if(command.undoable())
			undo_commands.push(command);
		command.execute();
	}	
	public void undo() {
		if(undo_commands.isEmpty()) {
			System.out.println("No command exist for undo");
			return;
		}
		AbstractCommand cmd = undo_commands.pop();
		redo_commands.push(cmd);
		cmd.undo();
	}
	
	public void redo() {
		if(redo_commands.isEmpty()) {
			System.out.println("No command exist for redo");
			return;
		}
		AbstractCommand cmd = redo_commands.pop();
		undo_commands.push(cmd);
		cmd.redo();
	}
	
	public void flush() {
		undo_commands.clear();
		redo_commands.clear();
	}

}
