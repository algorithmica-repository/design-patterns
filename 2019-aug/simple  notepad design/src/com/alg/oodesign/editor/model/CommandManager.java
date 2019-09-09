package com.alg.oodesign.editor.model;

import java.util.Stack;

public class CommandManager {
	private Stack<AbstractCommand> undo_stack;
	private Stack<AbstractCommand> redo_stack;
	//private List<AbstractCommand> log;
	
	public CommandManager() {
		undo_stack = new Stack<AbstractCommand>();
		redo_stack = new Stack<AbstractCommand>();
		//log = new ArrayList<AbstractCommand>();
	}
	
	public void invoke(AbstractCommand cmd) {
		cmd.execute();
		System.out.println(cmd);
		if(cmd.isUndoable())
			undo_stack.push(cmd);
	}
	
	public void redo() {
		AbstractCommand cmd = redo_stack.pop();
		cmd.execute();
		undo_stack.add(cmd);
	}
	
	public void undo() {
		AbstractCommand cmd = undo_stack.pop();
		cmd.unexecute();
		redo_stack.add(cmd);
	}
	
}
