package com.alg.dp.observer.solution2;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
	private Weather weather;	
	private List<IObserver> observers;
	
	public WeatherData() {
		observers = new ArrayList<IObserver>();
	}
	
	public void notify(float temp, float pressure, float humidity) {
		weather = new Weather(temp, pressure, humidity);
		for(IObserver observer:observers)
			observer.update(weather);
	}
	
	public void subscribe(IObserver observer) {
		observers.add(observer);
	}
	
	public void unsubscribe(IObserver observer) {
		observers.remove(observer);
	}
	

}
