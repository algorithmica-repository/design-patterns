package com.alg.dp.decorator.solution5;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCookie {	
	protected String description;
	protected List<IDecorator> decorators;
	
	public void setDecorators(List<IDecorator> decorators) {
		this.decorators = decorators;
	}
	
	public AbstractCookie() {
		decorators = new ArrayList<IDecorator>();
	}
	
	public String getDescription() {
			String res = description;
			for(IDecorator decorator:decorators)
				res += decorator.getDecorationDescription();
			return res;
	}
	public abstract float getCost();
}
