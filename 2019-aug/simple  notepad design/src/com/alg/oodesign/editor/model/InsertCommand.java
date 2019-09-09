package com.alg.oodesign.editor.model;

public class InsertCommand extends AbstractCommand {
	private String text;
	private int pos;

	public InsertCommand(BufferManager target, String text, int pos) {
		super(target);
		this.text = text;
		this.pos = pos;
	}

	@Override
	boolean isUndoable() {
		return true;
	}

	@Override
	void execute() {
		target.insert(text, pos);
	}

	@Override
	void unexecute() {
		target.delete(pos, pos+text.length());
	}

}
