package com.alg.dp.observer.solution2;

public class CurrentConditionsDisplay implements IObserver {
	private Weather weather;
	
	public void update(Weather weather) {
		this.weather = weather;
		display();
	}
	public void display() {
		System.out.println("Temp:"  + weather.getTemperature() + "," 
							 + "Pressure:" + weather.getPressure() + ","
							 + "Humidity:" + weather.getHumidity());	
	}

}
