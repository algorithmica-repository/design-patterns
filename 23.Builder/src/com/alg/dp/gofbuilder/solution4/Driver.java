package com.alg.dp.gofbuilder.solution4;

public class Driver {

	public static void main(String[] args) {
		House house1 = House.builder()
						.foundation("foundation1")
						.structure("structure1")
						.roof("roof1")
						.painting(true)
						.getHouse();
		System.out.println(house1);
		
	

	}

}
