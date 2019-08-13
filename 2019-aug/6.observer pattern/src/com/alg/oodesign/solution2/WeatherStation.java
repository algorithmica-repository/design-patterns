package com.alg.oodesign.solution2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
	private List<IDisplay> display_units;

	public WeatherStation() {
		display_units = new ArrayList<IDisplay>();
	}
	public void change(float pressure, float temp, float humidity) {
		Weather w = new Weather(pressure, temp, humidity);
		for(IDisplay unit: display_units)
			unit.update(w);
	}
	
	public void subscribe(IDisplay unit) {
		display_units.add(unit);
	}
}
