package com.alg.dp.observer.solution1;

public class StatisticsDisplay {
	private float mintemp;
	private float maxtemp;
	
	public void update(Weather weather) {
		mintemp = Math.min(mintemp, weather.getTemperature());
		maxtemp = Math.max(maxtemp, weather.getTemperature());
		display();
	}
	public void display() {
		System.out.println("Min Temp:"  + mintemp + "," 
							 + "Max Temp:" + maxtemp);	
	}
}
