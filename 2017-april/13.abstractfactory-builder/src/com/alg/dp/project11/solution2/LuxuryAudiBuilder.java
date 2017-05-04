package com.alg.dp.project11.solution2;

public class LuxuryAudiBuilder {
	
	public static AudiCar getCar() {
		AudiCar audiCar = new AudiCar();
		audiCar.setGearBox(new LGearBox());
		audiCar.setStereo(new LStereo());
		audiCar.setWheels(new LWheel());
		return audiCar;
	}

}
