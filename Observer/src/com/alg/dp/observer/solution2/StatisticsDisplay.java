package com.alg.dp.observer.solution2;

public class StatisticsDisplay implements IObserver{
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
