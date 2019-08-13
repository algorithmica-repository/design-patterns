package com.alg.oodesign.solution1;

public class ForecastDisplay {
	private Weather forecasted;
	
	public ForecastDisplay() {
		forecasted = new Weather(0, 0, 0);
	}
	
	public void update(Weather w) {
		forecasted.setHumidity(forecasted.getHumidity() * 2 + w.getHumidity());
		forecasted.setPressure(forecasted.getPressure() * 2 + w.getPressure());
		forecasted.setTemp(forecasted.getTemp() * 1.5f + w.getTemp());
		System.out.println("Forecast Display:");
		System.out.println(forecasted);
	}
}
