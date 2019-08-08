package com.alg.oodesign.solution3;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random r = new Random(); 
		BreakfastMenu bmenu = new BreakfastMenu(5);
		for(int i = 0; i < 6; ++i) {
			String name = "BItem" + i;
			int price = r.nextInt(500) + 100;
			MenuItem item = new MenuItem(name, price);
			bmenu.addItem(item);;
		}
		
		DinnerMenu dmenu = new DinnerMenu();
		for(int i = 0; i < 10; ++i) {
			String name = "DItem" + i;
			int price = r.nextInt(500) + 100;
			MenuItem item = new MenuItem(name, price);
			dmenu.addItem(item);;
		}
		
		while(bmenu.hasNext())
			System.out.println(bmenu.next());
		
		while(dmenu.hasNext())
			System.out.println(dmenu.next());

	}

}
