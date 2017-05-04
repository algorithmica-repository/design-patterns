package com.alg.dp.project11.solution4;

public class LuxuryCarFactory implements ICarFactory {
	
	@Override
	public IGearBox getGearBox() {
		return new LGearBox();
	}

	@Override
	public IWheel getWheel() {
		return new LWheel();
	}

	@Override
	public IStereo getStereo() {
		return new LStereo();
	}
	

}
