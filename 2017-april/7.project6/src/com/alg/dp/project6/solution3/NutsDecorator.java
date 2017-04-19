package com.alg.dp.project6.solution3;

public class NutsDecorator extends AbstractCookie {
	private float qty;
	private AbstractCookie cookie;
	
	public NutsDecorator(AbstractCookie cookie) {
		this.cookie = cookie;
		cookie.setDescription(cookie.getDescription() + " with nuts");
		cookie.setPrice(cookie.getPrice() + 10);
		qty = 5;
	}
	
	public NutsDecorator(AbstractCookie cookie, float qty) {
		this.cookie = cookie;
		cookie.setDescription(cookie.getDescription() + " with nuts");
		cookie.setPrice(cookie.getPrice() + qty*2);
		this.qty = qty;
	}

	@Override
	public String toString() {
		return cookie.toString() +",qty=" + qty;
	}
	
	public float getPrice() {
		return cookie.getPrice();
	}
	
	public String getDescription() {
		return cookie.getDescription();
	}
}
