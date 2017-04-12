package com.alg.dp.project4.solution2;

public class ForecastDisplay implements IDisplay {
	private Weather weather_forecast;
	
	public ForecastDisplay() {
		weather_forecast = new Weather();
	}
	
	public void update(Weather weather) {
		weather_forecast.setTemp(weather.getTemp() * 2 + 3);
		weather_forecast.setPressure(weather.getPressure() * 10 - 5);
		weather_forecast.setHumidity(weather.getHumidity() + 4);
		System.out.println("Forecasted Temperature:" + weather.getTemp());
		System.out.println("Forecasted Pressure:" + weather.getPressure());
		System.out.println("Forecasted Humidity:" + weather.getHumidity());

	}

}
