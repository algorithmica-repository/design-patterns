package com.alg.dp.project4.solution2;

public class CurrentCondtionsDisplay implements IDisplay {
	
	private Weather weather;
	
	public void update(Weather weather) {
		this.weather = weather;
		System.out.println("Temperature:" + weather.getTemp());
		System.out.println("Pressure:" + weather.getPressure());
		System.out.println("Humidity:" + weather.getHumidity());
	}

}
