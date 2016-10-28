package com.alg.dp.af.solution2;

public class AudiEconomyCarFactory implements ICarFactory {

	@Override
	public IChasis createChasis() {
		// TODO Auto-generated method stub
		return new EChasis();
	}

	@Override
	public IGearbox createGearBox() {
		// TODO Auto-generated method stub
		return new EGearbox();
	}

	@Override
	public IStereo createStereo() {
		// TODO Auto-generated method stub
		return new EStereo();
	}

}
