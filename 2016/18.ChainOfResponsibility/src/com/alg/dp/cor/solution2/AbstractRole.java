package com.alg.dp.cor.solution2;

public abstract class AbstractRole {
	private float maxLimit;
	private int id;
	protected AbstractRole successor;	

	public AbstractRole getSuccessor() {
		return successor;
	}

	public void setSuccessor(AbstractRole successor) {
		this.successor = successor;
	}

	public AbstractRole(int id, float maxLimit) {
		super();
		this.id = id;
		this.maxLimit = maxLimit;
	}
	
	public abstract String getRole();

	public boolean approve(float amount) {
		if(amount < maxLimit) {
			System.out.println(amount + " is approved by " + getRole() + " with id:" + id);
			return true;
		}
		else {
			if(successor == null) return false;
			return successor.approve(amount);
		}
	}

}
