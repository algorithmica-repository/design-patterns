package com.alg.dp.iterator.solution2;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private List<IMenu> menus;

	public Manager() {
		menus = new ArrayList<IMenu>();
	}

	public void addMenu(IMenu menu) {
		menus.add(menu);
	}

	public void traverse() {
		for (int i = 0; i < menus.size(); ++i) {
			Iterator itr = menus.get(i).iterator();
			while (itr.hasNext())
				System.out.println(itr.next());
		}
	}

}
