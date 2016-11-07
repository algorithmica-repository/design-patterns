package com.alg.dp.builder.solution3;

public class House {
	private String foundation;
	private String structure;
	private String roof;
	private boolean painting;
	private boolean furniture;
	private boolean falseCeiling;
	
	
	House() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFoundation() {
		return foundation;
	}
	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	public boolean isPainting() {
		return painting;
	}
	public void setPainting(boolean painting) {
		this.painting = painting;
	}
	public boolean isFurniture() {
		return furniture;
	}
	public void setFurniture(boolean furniture) {
		this.furniture = furniture;
	}
	public boolean isFalseCeiling() {
		return falseCeiling;
	}
	public void setFalseCeiling(boolean falseCeiling) {
		this.falseCeiling = falseCeiling;
	}
	@Override
	public String toString() {
		return "House [foundation=" + foundation + ", structure=" + structure
				+ ", roof=" + roof + ", painting=" + painting + ", furniture="
				+ furniture + ", falseCeiling=" + falseCeiling + "]";
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	
}
