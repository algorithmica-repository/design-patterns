package com.alg.oodesign.solution2;

public class Test {

	public static void main(String[] args) {
		IFactory factory = new EconomyFactory();
		AudiCar ec1 = new AudiCar(factory);
		System.out.println(ec1);
		
		factory = new MediumFactory();
		AudiCar mc1 = new AudiCar(factory);
		System.out.println(mc1);
		
		factory = new LuxuryFactory();
		AudiCar lc1 = new AudiCar(factory);
		System.out.println(lc1);	

	}

}
