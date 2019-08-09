package com.alg.oodesign.solution1;

import java.util.List;
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
		
		MenuItem[] bitems = bmenu.getItems();
		for(MenuItem item:bitems)
			System.out.println(item);
		
		List<MenuItem> ditems = dmenu.getItems();
		for(MenuItem item:ditems)
			System.out.println(item);

	}

}
