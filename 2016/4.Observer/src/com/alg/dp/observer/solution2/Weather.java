package com.alg.dp.observer.solution2;

public class Weather {
	
	private float temperature;
	private float pressure;
	private float humidity;
	
	public Weather(float temperature, float pressure, float humidity) {
		super();
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
	

}
