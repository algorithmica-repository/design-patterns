package com.alg.oodesign.editor.model;

public class CopyCommand extends AbstractCommand {
	private int start;
	private int end;
		
	public CopyCommand(BufferManager target, int start, int end) {
		super(target);
		this.start = start;
		this.end = end;
	}

	@Override
	boolean isUndoable() {
		return false;
	}

	@Override
	void execute() {
		target.copy(start, end);
	}

	@Override
	void unexecute() {
		
	}

}
