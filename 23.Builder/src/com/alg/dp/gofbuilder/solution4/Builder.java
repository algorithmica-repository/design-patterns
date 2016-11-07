package com.alg.dp.gofbuilder.solution4;

public class Builder {
	private House house;

	public Builder() {
		house = new House();
	}
	public Builder foundation(String foundation) {
		house.setFoundation(foundation);
		return this;
	}
	
	public Builder structure(String structure) {
		house.setStructure(structure);
		return this;
	}
	
	public Builder roof(String roof) {
		house.setRoof(roof);
		return this;
	}
	
	public Builder painting(boolean paint) {
		house.setPainting(paint);
		return this;
	}
	public House getHouse() {
		return house;
	}
	
}
