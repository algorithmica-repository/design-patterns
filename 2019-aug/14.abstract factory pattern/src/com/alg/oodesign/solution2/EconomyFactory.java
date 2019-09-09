package com.alg.oodesign.solution2;

public class EconomyFactory implements IFactory {

	@Override
	public IGearBox getGearBox() {
		return new Manual();
	}

	@Override
	public IWheels getWheels() {
		return new StandardWheels();
	}

}
