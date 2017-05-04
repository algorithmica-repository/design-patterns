package com.alg.dp.project11.solution1;

public class Driver {

	public static void main(String[] args) {
		AudiCar car1 = new AudiCar();
		car1.setGearBox(new EGearBox());
		car1.setStereo(new EStereo());
		car1.setWheels(new EWheel());
		System.out.println(car1);
		
		AudiCar car2 = new AudiCar();
		car2.setGearBox(new EGearBox());
		car2.setStereo(new MStereo());
		car2.setWheels(new LWheel());
		System.out.println(car2);
	}

}
