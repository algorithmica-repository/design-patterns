package com.alg.dp.af.solution1;

public class AudiCar {
	private IChasis chasis;
	private IStereo stereo;
	private IGearbox gearbox;
	
	public AudiCar() {
	}
	
	public IChasis getChasis() {
		return chasis;
	}

	public void setChasis(IChasis chasis) {
		this.chasis = chasis;
	}

	public IStereo getStereo() {
		return stereo;
	}

	public void setStereo(IStereo stereo) {
		this.stereo = stereo;
	}

	public IGearbox getGearbox() {
		return gearbox;
	}

	public void setGearbox(IGearbox gearbox) {
		this.gearbox = gearbox;
	}

	public void display() {
		System.out.println(chasis.getDescription());
		System.out.println(stereo.getDescription());
		System.out.println("chechk"+gearbox.getDescription());
	}
	

}
