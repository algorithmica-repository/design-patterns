package com.alg.dp.gofbuilder.solution4;

public class Engineer {
	
	private Builder builder;
	
	public Engineer(Builder builder) {
		this.builder = builder;
	}

	public House makeHouse() {
		builder.buildFoundation();
		builder.buildStructure();
		
		builder.getHouse();
	}
}
