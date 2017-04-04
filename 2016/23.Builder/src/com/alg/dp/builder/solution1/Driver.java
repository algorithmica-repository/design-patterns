package com.alg.dp.builder.solution1;

public class Driver {

	public static void main(String[] args) {
		House house1 = new House("foundation", "structure","roof");
		System.out.println(house1);
		
		House house2 = new House("foundation", "structure","roof", true);
		System.out.println(house2);
	}

}
