package com.alg.oodesign.solution2;

public class ScaleCommand extends AbstractCommand {
	private int k;

	public ScaleCommand(Square square, int k) {
		super("scale", square);
		this.k = k;
	}

	@Override
	public void execute() {
		square.scale(k);		
	}

	@Override
	public void unexecute() {
		square.unscale(k);		
	}
	
	
}
