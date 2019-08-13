package com.alg.oodesign.solution2;

public class StatisticsDisplay  implements IDisplay{
	private float min_temp;
	private float max_temp;
	private float min_pressure;
	private float max_pressure;
	
	public void update(Weather w) {
		min_temp = Math.min(w.getTemp(), min_temp);
		max_temp = Math.max(w.getTemp(), max_temp);
		System.out.println("Statistics Display:");
		System.out.println("min temp:" + min_temp);
		System.out.println("max_temp:" + max_temp);
	}
}
