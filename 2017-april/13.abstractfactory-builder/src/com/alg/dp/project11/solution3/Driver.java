package com.alg.dp.project11.solution3;

public class Driver {

	public static void main(String[] args) {
		AbstractAudiBuilder builder = new EconomyAudiBuilder();
		AudiCar car1 = builder.getCar();
		System.out.println(car1);
		
		builder = new MediumAudiBuilder();
		AudiCar car2 = builder.getCar();
		System.out.println(car2);
	}

}
