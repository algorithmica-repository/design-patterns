package com.alg.dp.decorator.solution2;

public class AbstractCookie {	
	protected String description;
	protected boolean requireNuts;
	protected boolean requireSprinkles;	
	
	public void setRequireNuts(boolean requireNuts) {
		this.requireNuts = requireNuts;
	}

	public void setRequireSprinkles(boolean requireSprinkles) {
		this.requireSprinkles = requireSprinkles;
	}


	public String getDescription() {
		if(requireNuts)
			return description + " with Nuts";
		else if(requireSprinkles)
			return description + " with Sprinkles";
		else
			return description;
	}

}
