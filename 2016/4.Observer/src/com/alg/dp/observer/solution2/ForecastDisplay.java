package com.alg.dp.observer.solution2;

public class ForecastDisplay implements IObserver {
	private Weather weather;
	
	private Weather forecast(Weather weather)  {
		return new Weather(weather.getTemperature() + 10,weather.getPressure() + 5 , weather.getHumidity() + 30);
	}
	public void update(Weather weather) {
		this.weather = forecast(weather);		
		display();
	}
	public void display() {
		System.out.println("Temp:"  + weather.getTemperature() + "," 
							 + "Pressure:" + weather.getPressure() + ","
							 + "Humidity:" + weather.getHumidity());	
	}
}
