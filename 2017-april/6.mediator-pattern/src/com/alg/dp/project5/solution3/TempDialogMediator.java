package com.alg.dp.project5.solution3;

import java.util.ArrayList;
import java.util.List;

public class TempDialogMediator {
	private List<IWidget> widgets;
	
	public TempDialogMediator() {
		widgets = new ArrayList<IWidget>();
	}
	public void addWidget(IWidget widget) {
		widgets.add(widget);
	}
	public void notify(IWidget widget, float temp) {
		for(IWidget wd: widgets) {
			if(wd != widget)
				wd.update(temp);
		}
	}
	
	//when button is a source of event, how do we know which editbox value have to read?


	
}
