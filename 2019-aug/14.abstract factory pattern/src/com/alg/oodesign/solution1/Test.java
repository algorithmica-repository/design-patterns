package com.alg.oodesign.solution1;

public class Test {

	public static void main(String[] args) {
		AudiCar ec1 = new AudiCar(new Manual(), new StandardWheels());
		System.out.println(ec1);
		
		AudiCar mc1 = new AudiCar(new Automatic(), new AlloyWheels());
		System.out.println(mc1);
		
		AudiCar lc1 = new AudiCar(new Hybrid(), new AlloyWheels());
		System.out.println(lc1);
		

	}

}
