package com.alg.dp.af.solution2;

public class Driver {

	public static void main(String[] args) {
		ICarFactory carFactory = new AudiEconomyCarFactory();
		AudiCar ecar1 = new AudiCar(carFactory);
		ecar1.makeCar();
		ecar1.display();
	}

}
