package com.alg.oodesign.solution2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		WeatherStation ws = new WeatherStation();
		ws.subscribe(new ForecastDisplay());
		ws.subscribe(new CurrentConditionsDisplay());
		ws.subscribe(new StatisticsDisplay());
		
		Scanner scanner = new Scanner(System.in);
		String next = "C";
		do {
			float pressure = scanner.nextFloat();
			float temp = scanner.nextFloat();
			float humidity = scanner.nextFloat();
			ws.change(pressure, temp, humidity);
			next = scanner.next();
		} while(next.equals("C"));
	}

}
