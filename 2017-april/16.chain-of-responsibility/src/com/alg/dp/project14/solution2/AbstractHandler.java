package com.alg.dp.project14.solution2;

public abstract class AbstractHandler {
	private String name;
	private String role;
	private float maxlimit;
	protected AbstractHandler successor;
	
	public AbstractHandler(String name, String role, float maxlimit) {
		super();
		this.name = name;
		this.role = role;
		this.maxlimit = maxlimit;
	}

	@Override
	public String toString() {
		return "AbstractRole [name=" + name + ", role=" + role + "]";
	}
	
	public void approve(PurchaseOrder po) {
		if(po.getAmount() < maxlimit) {
			System.out.println("approved by " + toString());
		}
		else {
			if(successor != null)
				successor.approve(po);
		}
			
	}
	public void successor(AbstractHandler successor) {
		this.successor = successor;
	}
	
}
