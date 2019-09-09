package com.alg.oodesign.editor.model;

import java.io.File;

public class SaveCommand extends AbstractCommand {
	private File file;
	
	public SaveCommand(BufferManager target, File file) {
		super(target);
		this.file = file;
	}

	@Override
	boolean isUndoable() {
		return false;
	}

	@Override
	void execute() {
		target.save(file);
	}

	@Override
	void unexecute() {
		// TODO Auto-generated method stub

	}

}
