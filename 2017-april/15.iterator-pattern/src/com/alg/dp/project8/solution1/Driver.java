package com.alg.dp.project8.solution1;

import java.util.List;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		Random r = new Random();
		
		DinnerUnit dinnerUnit = new DinnerUnit();
		for(int i =  1; i <= 10; ++i) {
			String name = "DinnerItem" + i;
			float price = 50 + i * 5;
			int qty = r.nextInt(5) + 1;
			dinnerUnit.addItem(new MenuItem(name, price, qty));
		}
		
		BreakfastUnit breakfastUnit = new BreakfastUnit(5);
		for(int i =  1; i <= 5; ++i) {
			String name = "BreakfastItem" + i;
			float price = 30 + i * 5;
			int qty = r.nextInt(3) + 1;
			breakfastUnit.addItem(new MenuItem(name, price, qty));
		}
		
		//go through all the menu items
		List<MenuItem> dinnerItems = dinnerUnit.getMenuItems();
		for(int i = 0; i < dinnerItems.size(); ++i)
			System.out.println(dinnerItems.get(i));

		MenuItem[] breakfastItems = breakfastUnit.getMenuItems();
		for(int i = 0; i < breakfastItems.length; ++i)
			System.out.println(breakfastItems[i]);

	}

}
