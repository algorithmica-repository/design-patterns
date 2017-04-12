package com.alg.dp.project4.solution2;

public class StatisticsDisplay implements IDisplay {
	private float minTemp;
	private float maxTemp;
	private float minPressure;
	private float maxPressure;
	
	public StatisticsDisplay() {
		minTemp = Float.MAX_VALUE;
		maxTemp = Float.MIN_VALUE;
	}
	public void update(Weather weather) {
		minTemp = Math.min(minTemp, weather.getTemp());
		maxTemp = Math.max(maxTemp, weather.getTemp());
		minPressure = Math.min(minPressure, weather.getPressure());
		maxPressure = Math.max(maxPressure, weather.getPressure());
		System.out.println("MinTemp:" + minTemp + ",MaxTemp:"+ maxTemp);
		System.out.println("MinPresure:" + minPressure + ",MaxPressure:"+ maxPressure);
	}

}
