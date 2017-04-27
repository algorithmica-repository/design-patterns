package com.alg.dp.project8.solution2;

import java.util.List;
import java.util.Random;

class Dummy extends Thread {
	private DinnerUnit dinnerUnit;
	private BreakfastUnit breakfastUnit;
	
	public Dummy(DinnerUnit dinnerUnit, BreakfastUnit breakfastUnit) {
		super();
		this.dinnerUnit = dinnerUnit;
		this.breakfastUnit = breakfastUnit;
	}
	
	private void display(Iterator iterator) {
		iterator.reset();
		while(iterator.hasNext())
			System.out.println(Thread.currentThread().getId() + " " + iterator.next());
	}
	
	public void run() {
		display(dinnerUnit);
		display(breakfastUnit);
	}
	
}
public class Driver {
	
	public static void test1(Iterator iterator)  {
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

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
		/*test1(dinnerUnit);
		test1(breakfastUnit);
		dinnerUnit.reset();
		breakfastUnit.reset();
		test1(dinnerUnit);*/
		
		Thread t1 = new Dummy(dinnerUnit, breakfastUnit);
		Thread t2 = new Dummy(dinnerUnit, breakfastUnit);
		t1.start();
		t2.start();
		
	}

}

//concurrent traversal is not possible
//dinnerunit and breakfastunit are treated as a type of iterator
