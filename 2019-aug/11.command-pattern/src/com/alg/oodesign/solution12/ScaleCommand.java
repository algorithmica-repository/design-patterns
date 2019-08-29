package com.alg.oodesign.solution12;

public class ScaleCommand extends AbstractCommand {
	private int k;

	public ScaleCommand(Square square, int k) {
		super("scale", square);
		this.k = k;
	}

	public int getK() {
		return k;
	}

	
}
