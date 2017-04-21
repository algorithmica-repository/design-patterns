package com.alg.dp.project6.solution3;

public class NutsDecorator implements ICookie {
	private float qty;
	private ICookie cookie;
	
	public NutsDecorator(ICookie cookie) {
		this.cookie = cookie;
		setDescription(cookie.getDescription() + " with nuts");
		setPrice(cookie.getPrice() + 10);
		qty = 5;
	}
	
	public NutsDecorator(ICookie cookie, float qty) {
		this.cookie = cookie;
		setDescription(cookie.getDescription() + " with nuts");
		setPrice(cookie.getPrice() + qty*2);
		this.qty = qty;
	}

	public String getCookieDetails() {
		return cookie.getCookieDetails() +",qty=" + qty;
	}
	
	public float getPrice() {
		return cookie.getPrice();
	}
	
	public String getDescription() {
		return cookie.getDescription();
	}
	
	public void setDescription(String description) {
		cookie.setDescription(description);
	}
	
	public void setPrice(float price) {
		cookie.setPrice(price);
	}
}
