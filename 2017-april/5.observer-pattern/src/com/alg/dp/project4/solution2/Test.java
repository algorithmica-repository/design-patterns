package com.alg.dp.project4.solution2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args)  {
		WeatherStation ws = new WeatherStation();
		ws.subscribe(new CurrentCondtionsDisplay());
		ws.subscribe(new StatisticsDisplay());
		ws.subscribe(new ForecastDisplay());

		String c;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter the sensor values:");
			float temp = scanner.nextFloat();
			float pressure = scanner.nextFloat();
			float humidity = scanner.nextFloat();
			ws.notify(temp, pressure, humidity);
			c = scanner.next();
		} while (c.equals("C"));
		

	}

}
