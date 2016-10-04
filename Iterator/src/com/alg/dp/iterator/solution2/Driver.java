package com.alg.dp.iterator.solution2;


public class Driver {

	public static void main(String[] args) {
		Manager m = new Manager();
		
		IMenu bmenu = new BreakfastMenu(5);
		bmenu.addItem(new MenuItem("bfitem1", "", 100, true));
		bmenu.addItem(new MenuItem("bfitem2", "", 200, false));
		bmenu.addItem(new MenuItem("bfitem3", "", 70, true));
		m.addMenu(bmenu);
		
		IMenu dmenu = new DinnerMenu();
		dmenu.addItem(new MenuItem("ditem1", "", 200, true));
		dmenu.addItem(new MenuItem("ditem2", "", 400, false));
		dmenu.addItem(new MenuItem("ditem3", "", 170, false));
		m.addMenu(dmenu);
		
		m.traverse();
	}

}
