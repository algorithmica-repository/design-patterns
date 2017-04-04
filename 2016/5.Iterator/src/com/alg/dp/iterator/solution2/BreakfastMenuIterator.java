package com.alg.dp.iterator.solution2;

public class BreakfastMenuIterator implements Iterator {
	private BreakfastMenu bmenu;
	private int currentItem;
	
	public BreakfastMenuIterator(BreakfastMenu bmenu) {
		this.bmenu = bmenu;
		currentItem = 0;
	}

	@Override
	public boolean hasNext() {
		if(currentItem < bmenu.size())
			return true;
		return false;
	}

	@Override
	public MenuItem next() {
		return bmenu.getMenuItems()[currentItem++];
	}

}
