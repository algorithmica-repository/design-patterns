package com.alg.dp.project11.solution2;

public class MediumAudiBuilder {
	
	public static AudiCar getCar() {
		AudiCar audiCar = new AudiCar();
		audiCar.setGearBox(new MGearBox());
		audiCar.setStereo(new MStereo());
		audiCar.setWheels(new MWheel());
		return audiCar;
	}

}
