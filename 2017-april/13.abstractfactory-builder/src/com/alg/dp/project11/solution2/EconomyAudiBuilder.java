package com.alg.dp.project11.solution2;

public class EconomyAudiBuilder {
	
	public static AudiCar getCar() {
		AudiCar audiCar = new AudiCar();
		audiCar.setGearBox(new EGearBox());
		audiCar.setStereo(new EStereo());
		audiCar.setWheels(new EWheel());
		return audiCar;
	}

}
