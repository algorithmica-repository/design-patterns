package com.alg.oodesign.solution3;

public class RotateCommand extends AbstractCommand {

	public RotateCommand(IShape shape) {
		super("rotate", shape);
	}

	@Override
	public void execute() {
		shape.rotate();
	}

	@Override
	public void unexecute() {
		shape.unrotate();
	}

}
