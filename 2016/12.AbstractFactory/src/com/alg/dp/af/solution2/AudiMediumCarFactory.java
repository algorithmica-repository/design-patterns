package com.alg.dp.af.solution2;

public class AudiMediumCarFactory implements ICarFactory {

	@Override
	public IChasis createChasis() {
		// TODO Auto-generated method stub
		return new MChasis();
	}

	@Override
	public IGearbox createGearBox() {
		// TODO Auto-generated method stub
		return new MGearbox();
	}

	@Override
	public IStereo createStereo() {
		// TODO Auto-generated method stub
		return new MStereo();
	}

}
