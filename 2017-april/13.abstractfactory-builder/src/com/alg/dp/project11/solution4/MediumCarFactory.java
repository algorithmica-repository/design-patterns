package com.alg.dp.project11.solution4;

public class MediumCarFactory implements ICarFactory {
	
	@Override
	public IGearBox getGearBox() {
		return new MGearBox();
	}

	@Override
	public IWheel getWheel() {
		return new MWheel();
	}

	@Override
	public  IStereo getStereo() {
		return new MStereo();
	}
	

}
