package com.alg.dp.observer.solution2;

public class Driver {

	public static void main(String[] args) {
		
		WeatherData wd = new WeatherData();
		wd.subscribe(new CurrentConditionsDisplay());
		wd.subscribe(new StatisticsDisplay());
		wd.notify(40, 20, 30);

	}

}
