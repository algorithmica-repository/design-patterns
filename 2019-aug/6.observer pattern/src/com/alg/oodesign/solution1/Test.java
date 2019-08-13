package com.alg.oodesign.solution1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		WeatherStation ws = new WeatherStation();
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
