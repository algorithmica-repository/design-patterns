package com.alg.oodesign.solution1;

public class WeatherStation {
	private ForecastDisplay fdisplay;
	private StatisticsDisplay sdisplay;
	private CurrentConditionsDisplay cdisplay;

	public WeatherStation() {
		fdisplay = new ForecastDisplay();
		sdisplay = new StatisticsDisplay();
		cdisplay = new CurrentConditionsDisplay();
	}
	public void change(float pressure, float temp, float humidity) {
		Weather w = new Weather(pressure, temp, humidity);
		fdisplay.update(w);
		sdisplay.update(w);
		cdisplay.update(w);
	}
}
