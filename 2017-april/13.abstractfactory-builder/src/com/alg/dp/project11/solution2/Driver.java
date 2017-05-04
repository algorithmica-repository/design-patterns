package com.alg.dp.project11.solution2;

public class Driver {

	public static void main(String[] args) {
		AudiCar car1 = EconomyAudiBuilder.getCar();
		System.out.println(car1);
		
		AudiCar car2 = MediumAudiBuilder.getCar();
		System.out.println(car2);
	}

}
