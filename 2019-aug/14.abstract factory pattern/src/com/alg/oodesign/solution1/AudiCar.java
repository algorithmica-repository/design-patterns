package com.alg.oodesign.solution1;

public class AudiCar {
	private IGearBox gbox;
	private IWheels wheels;
	
	public AudiCar(IGearBox gbox, IWheels wheels) {
		super();
		this.gbox = gbox;
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "AudiCar [gbox=" + gbox + ", wheels=" + wheels + "]";
	}
	
	
}
