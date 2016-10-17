package com.alg.dp.af.solution2;

public class AudiCar {
	private IChasis chasis;
	private IStereo stereo;
	private IGearbox gearbox;	
	private ICarFactory carFactory;
	
	public AudiCar(ICarFactory carFactory) {
		this.carFactory = carFactory;
	}
	
	public void makeCar() {
		chasis = carFactory.createChasis();
		stereo = carFactory.createStereo();
		gearbox = carFactory.createGearBox();
	}
	public void display() {
		System.out.println(chasis.getDescription());
		System.out.println(stereo.getDescription());
		System.out.println(gearbox.getDescription());
	}
	

}
