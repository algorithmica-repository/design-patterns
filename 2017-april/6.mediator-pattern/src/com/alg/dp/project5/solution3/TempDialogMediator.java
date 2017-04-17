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
	public void notify(float temp) {
		for(IWidget widget: widgets) {
			widget.update(temp);
		}
	}

	
}
