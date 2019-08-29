package com.alg.oodesign.solution4;

public class ScaleCommand extends AbstractCommand {
	private int k;

	public ScaleCommand(IShape shape, int k) {
		super("scale", shape);
		this.k = k;
	}

	@Override
	public void execute() {
		shape.scale(k);		
	}

	@Override
	public void unexecute() {
		shape.unscale(k);		
	}
	
	
}
