package com.alg.dp.project11.solution4;

public class Driver {

	public static void main(String[] args) {
		ICarFactory factory = new EconomyCarFactory();
		AudiCar car1 = new AudiCar();
		car1.setGearBox(factory.getGearBox());
		car1.setStereo(factory.getStereo());
		car1.setWheels(factory.getWheel());
		System.out.println(car1);
		
		factory = new MediumCarFactory();
		AudiCar car2 = new AudiCar();
		car2.setGearBox(factory.getGearBox());
		car2.setStereo(factory.getStereo());
		car2.setWheels(factory.getWheel());
		System.out.println(car2);
	}

}
