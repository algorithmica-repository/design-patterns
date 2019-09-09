package com.alg.oodesign.editor.model;

import java.io.File;

public class OpenCommand extends AbstractCommand {
	private File file;
	
	public OpenCommand(BufferManager target, File file) {
		super(target);
		this.file = file;
	}

	@Override
	boolean isUndoable() {
		return false;
	}

	@Override
	void execute() {
		target.open(file);
	}

	@Override
	void unexecute() {
		// TODO Auto-generated method stub

	}

}
