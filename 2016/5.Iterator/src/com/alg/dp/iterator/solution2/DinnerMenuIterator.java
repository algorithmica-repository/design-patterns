package com.alg.dp.iterator.solution2;

public class DinnerMenuIterator implements Iterator {
	private DinnerMenu dmenu;
	private int currentItem;
	
	public DinnerMenuIterator(DinnerMenu dmenu) {
		this.dmenu = dmenu;
		currentItem = 0;
	}

	@Override
	public boolean hasNext() {
		if(currentItem < dmenu.getMenuItems().size())
			return true;
		return false;
	}

	@Override
	public MenuItem next() {
		return dmenu.getMenuItems().get(currentItem++);
	}

}
