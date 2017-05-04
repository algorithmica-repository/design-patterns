package com.alg.dp.project11.solution3;

public class LuxuryAudiBuilder extends AbstractAudiBuilder {
	
	@Override
	IGearBox getGearBox() {
		return new LGearBox();
	}

	@Override
	IWheel getWheel() {
		return new LWheel();
	}

	@Override
	IStereo getStereo() {
		return new LStereo();
	}
	

}
