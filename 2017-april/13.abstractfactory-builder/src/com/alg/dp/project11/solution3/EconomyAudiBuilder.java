package com.alg.dp.project11.solution3;

public class EconomyAudiBuilder extends AbstractAudiBuilder{

	@Override
	IGearBox getGearBox() {
		return new EGearBox();
	}

	@Override
	IWheel getWheel() {
		return new EWheel();
	}

	@Override
	IStereo getStereo() {
		return new EStereo();
	}
	


}
