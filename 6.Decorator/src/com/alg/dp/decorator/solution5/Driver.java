package com.alg.dp.decorator.solution5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Driver {


	public static void main(String[] args) {
		AbstractCookie sc1 = new SquareCookie();
		System.out.println(sc1.getDescription());
		System.out.println(sc1.getCost());
		
		AbstractCookie sc2 = new SquareCookie();
		List<IDecorator> decorators = new ArrayList<IDecorator>();
		decorators.add(new NutsDecorator());
		sc2.setDecorators(decorators);
		System.out.println(sc2.getDescription());
		System.out.println(sc2.getCost());
				
		AbstractCookie sc3 = new SquareCookie();
		decorators = new ArrayList<IDecorator>();
		decorators.add(new NutsDecorator());
		decorators.add(new SprinklesDecorator());
		sc3.setDecorators(decorators);
		System.out.println(sc3.getDescription());
		System.out.println(sc3.getCost());
	
	}

}
