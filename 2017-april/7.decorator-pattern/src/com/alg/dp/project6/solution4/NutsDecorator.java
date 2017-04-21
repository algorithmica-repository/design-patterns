package com.alg.dp.project6.solution4;

public class NutsDecorator extends AbstractDecorator {
	private float qty;
	
	public NutsDecorator(AbstractCookie cookie) {
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
	
	
}
