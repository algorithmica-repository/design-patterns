package com.alg.oodesign.editor.model;

public class CutCommand extends AbstractCommand {
	private int start;
	private int end;
		
	public CutCommand(BufferManager target, int start, int end) {
		super(target);
		this.start = start;
		this.end = end;
	}

	@Override
	boolean isUndoable() {
		return true;
	}

	@Override
	void execute() {
		target.cut(start, end);
	}

	@Override
	void unexecute() {
		target.paste(start);
	}

}
