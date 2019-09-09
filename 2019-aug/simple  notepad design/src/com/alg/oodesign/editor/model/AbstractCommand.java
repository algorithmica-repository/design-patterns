package com.alg.oodesign.editor.model;

public abstract class AbstractCommand {
	protected BufferManager target;
	
	public AbstractCommand(BufferManager target) {
		this.target = target;
	}
	abstract boolean isUndoable();
	abstract void execute();
	abstract void unexecute();	
}
