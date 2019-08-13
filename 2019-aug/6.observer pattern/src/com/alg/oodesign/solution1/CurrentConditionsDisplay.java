package com.alg.oodesign.solution1;

public class CurrentConditionsDisplay {

	public void update(Weather w) {
		System.out.println("Current Conditions Display");
		System.out.println("Temp:" + w.getTemp());
		System.out.println("Pressure:" + w.getPressure());
		System.out.println("Humidity:" + w.getHumidity());
	}
	
}
