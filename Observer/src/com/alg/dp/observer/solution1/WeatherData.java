package com.alg.dp.observer.solution1;

public class WeatherData {
	private Weather weather;	
	private CurrentConditionsDisplay cdisplay;
	private StatisticsDisplay sdisplay;
	private ForecastDisplay fdisplay;
	
	public WeatherData() {
		cdisplay = new CurrentConditionsDisplay();
		sdisplay = new StatisticsDisplay();
		fdisplay = new ForecastDisplay();
	}
	
	public void notify(float temp, float pressure, float humidity) {
		weather = new Weather(temp, pressure, humidity);
		cdisplay.update(weather);
		sdisplay.update(weather);
		fdisplay.update(weather);
	}
	
	

}
