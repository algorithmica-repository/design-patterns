package com.alg.oodesign.solution2;

public class Weather {
	private float pressure;
	private float temp;
	private float humidity;
	
	public Weather(float pressure, float temp, float humidity) {
		super();
		this.pressure = pressure;
		this.temp = temp;
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public float getTemp() {
		return temp;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	@Override
	public String toString() {
		return "Weather [pressure=" + pressure + ", temp=" + temp
				+ ", humidity=" + humidity + "]";
	}
	
	
}
