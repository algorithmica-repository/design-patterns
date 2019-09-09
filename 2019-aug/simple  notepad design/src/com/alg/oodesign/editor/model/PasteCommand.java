package com.alg.oodesign.editor.model;

public class PasteCommand extends AbstractCommand {
	private int pos;

	public PasteCommand(BufferManager target, int pos) {
		super(target);
		this.pos = pos;
	}

	@Override
	boolean isUndoable() {
		return true;
	}

	@Override
	void execute() {
		target.paste(pos);
	}

	@Override
	void unexecute() {
		target.cut(pos, pos+Clipboard.getInstance().get().length());
	}

}
