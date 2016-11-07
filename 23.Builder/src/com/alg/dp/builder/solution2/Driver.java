package com.alg.dp.builder.solution2;

public class Driver {

	public static void main(String[] args) {
		House house1 = new House();
		house1.setFoundation("foundation1");
		house1.setStructure("structure1");
		house1.setRoof("roof1");		
		System.out.println(house1);
		
		House house2 = new House();
		house2.setFoundation("foundation2");
		house2.setStructure("structure2");
		house2.setRoof("roof2");
		house2.setPainting(true);
		System.out.println(house2);

	}

}
