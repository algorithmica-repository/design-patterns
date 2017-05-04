package com.alg.dp.project11.solution4;

import com.alg.dp.project11.solution1.EStereo;
import com.alg.dp.project11.solution1.EWheel;

public class AudiCar {
	private IGearBox gearBox;
	private IWheel wheels;
	private IStereo stereo;
	
	public void setGearBox(IGearBox gearBox) {
		this.gearBox = gearBox;
	}

	public void setWheels(IWheel wheels) {
		this.wheels = wheels;
	}

	public void setStereo(IStereo stereo) {
		this.stereo = stereo;
	}
	@Override
	public String toString() {
		return "AudiCar [gearBox=" + gearBox + ", wheels=" + wheels
				+ ", stereo=" + stereo + "]";
	}
	
	
		

}
