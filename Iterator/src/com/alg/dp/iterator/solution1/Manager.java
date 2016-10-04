package com.alg.dp.iterator.solution1;

import java.util.ArrayList;

public class Manager {
	private BreakfastMenu bm;
	private DinnerMenu dm;
	final static int MAX_BREAKFAST_ITEMS = 5;
	
	public Manager() {
		bm = new BreakfastMenu(MAX_BREAKFAST_ITEMS);
		dm = new DinnerMenu();
		bm.addItem(new MenuItem("bfitem1", "", 100, true));
		bm.addItem(new MenuItem("bfitem2", "", 200, false));
		bm.addItem(new MenuItem("bfitem3", "", 70, true));
		bm.addItem(new MenuItem("bfitem4", "", 90, true));
		
		dm.addItem(new MenuItem("ditem1", "", 200, true));
		dm.addItem(new MenuItem("ditem2", "", 400, false));
		dm.addItem(new MenuItem("ditem3", "", 170, false));
		dm.addItem(new MenuItem("ditem4", "", 290, true));
	}
	
	public void traverse() {
		MenuItem[] bfitems = bm.getMenuItems();
		for(int i = 0; i < bm.size(); ++i) 
			System.out.println(bfitems[i]);
		
		ArrayList<MenuItem> ditems = dm.getMenuItems();
		for(int i = 0; i < ditems.size(); ++i)
			System.out.println(ditems.get(i));
	}
	

}
