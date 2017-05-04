package com.alg.dp.project11.solution3;

public class MediumAudiBuilder extends AbstractAudiBuilder {
	
	@Override
	IGearBox getGearBox() {
		return new MGearBox();
	}

	@Override
	IWheel getWheel() {
		return new MWheel();
	}

	@Override
	IStereo getStereo() {
		return new MStereo();
	}
	

}
