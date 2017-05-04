package com.alg.dp.project11.solution4;

public class EconomyCarFactory implements ICarFactory {

	@Override
	public IGearBox getGearBox() {
		return new EGearBox();
	}

	@Override
	public IWheel getWheel() {
		return new EWheel();
	}

	@Override
	public IStereo getStereo() {
		return new EStereo();
	}
	


}
