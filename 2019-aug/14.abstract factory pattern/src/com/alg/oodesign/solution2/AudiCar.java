package com.alg.oodesign.solution2;

public class AudiCar {
	private IGearBox gbox;
	private IWheels wheels;
	private IFactory factory;
	
	public AudiCar(IFactory factory) {
		super();
		this.gbox = factory.getGearBox();
		this.wheels = factory.getWheels();
	}

	@Override
	public String toString() {
		return "AudiCar [gbox=" + gbox + ", wheels=" + wheels + "]";
	}
	
	
}
