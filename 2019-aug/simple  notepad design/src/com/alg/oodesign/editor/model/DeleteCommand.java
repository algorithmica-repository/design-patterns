package com.alg.oodesign.editor.model;

public class DeleteCommand extends AbstractCommand {
	private int start;
	private int end;
	private String text;
		
	public DeleteCommand(BufferManager target, int start, int end) {
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
		text = target.delete(start, end);
	}

	@Override
	void unexecute() {
		target.insert(text, start);
	}

}
