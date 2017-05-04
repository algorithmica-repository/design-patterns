package com.alg.dp.project11.solution3;

public abstract class AbstractAudiBuilder {	
	abstract IGearBox getGearBox();
	abstract IWheel getWheel();
	abstract IStereo getStereo();
	
	public AudiCar getCar() {
		AudiCar audiCar = new AudiCar();
		audiCar.setGearBox(getGearBox());
		audiCar.setStereo(getStereo());
		audiCar.setWheels(getWheel());
		return audiCar;
	}
}
