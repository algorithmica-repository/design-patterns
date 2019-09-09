package com.alg.oodesign.solution2;

public class MediumFactory implements IFactory {

	@Override
	public IGearBox getGearBox() {
		return new Automatic();
	}

	@Override
	public IWheels getWheels() {
		return new StandardWheels();
	}

}
