package com.alg.dp.builder.solution1;

public class House {
	private String foundation;
	private String structure;
	private String roof;
	private boolean painting;
	private boolean furniture;
	private boolean falseCeiling;
	
	public House(String foundation, String structure, String roof) {
		super();
		this.foundation = foundation;
		this.structure = structure;
		this.roof = roof;
	}

	public House(String foundation, String structure, String roof,
			boolean painting, boolean furniture, boolean falseCeiling) {
		super();
		this.foundation = foundation;
		this.structure = structure;
		this.roof = roof;
		this.painting = painting;
		this.furniture = furniture;
		this.falseCeiling = falseCeiling;
	}

	public House(String foundation, String structure, String roof,
			boolean painting) {
		super();
		this.foundation = foundation;
		this.structure = structure;
		this.roof = roof;
		this.painting = painting;
	}

	@Override
	public String toString() {
		return "House [foundation=" + foundation + ", structure=" + structure
				+ ", roof=" + roof + ", painting=" + painting + ", furniture="
				+ furniture + ", falseCeiling=" + falseCeiling + "]";
	}
	
	
	
}
