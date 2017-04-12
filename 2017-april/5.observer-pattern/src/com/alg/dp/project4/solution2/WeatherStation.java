package com.alg.dp.project4.solution2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
	private List<IDisplay> display_units;
	
	public WeatherStation() {
		display_units = new ArrayList<IDisplay>();
	}
	
	public void subscribe(IDisplay display) {
		display_units.add(display);
	}
	
	public void unsubscribe(IDisplay display) {
		display_units.remove(display);
	}
	public void notify(float temp, float pressure, float humidity) {
		Weather weather = new Weather(temp, pressure, humidity);
		for(IDisplay display: display_units)
			display.update(weather);
	}
}
