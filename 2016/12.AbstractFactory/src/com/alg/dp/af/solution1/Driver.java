package com.alg.dp.af.solution1;

public class Driver {

	public static void main(String[] args) {
		AudiCar ecar1 = new AudiCar();
		ecar1.setChasis(new EChasis());
		ecar1.setGearbox(new EGearbox());
		ecar1.setStereo(new EStereo());
		ecar1.display();
	}

}
