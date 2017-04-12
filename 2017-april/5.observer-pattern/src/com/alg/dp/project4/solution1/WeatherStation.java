package com.alg.dp.project4.solution1;

public class WeatherStation {
	private CurrentCondtionsDisplay cdisplay;
	private StatisticsDisplay sdisplay;
	private ForecastDisplay fdisplay;
	
	public WeatherStation() {
		cdisplay = new CurrentCondtionsDisplay();
		sdisplay = new StatisticsDisplay();
		fdisplay = new ForecastDisplay();
	}
	
	public void notify(float temp, float pressure, float humidity) {
		Weather weather = new Weather(temp, pressure, humidity);
		cdisplay.update(weather);
		sdisplay.update(weather);
		fdisplay.update(weather);
	}
}
