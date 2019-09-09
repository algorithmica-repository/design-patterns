package com.alg.oodesign.solution2;

public class LuxuryFactory implements IFactory {

	@Override
	public IGearBox getGearBox() {
		return new Hybrid();
	}

	@Override
	public IWheels getWheels() {
		return new AlloyWheels();
	}

}
