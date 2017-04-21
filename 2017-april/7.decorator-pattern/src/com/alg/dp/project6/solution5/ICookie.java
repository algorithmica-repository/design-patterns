package com.alg.dp.project6.solution5;

public interface ICookie {
	float getPrice();
	String getDescription();
	String getCookieDetails();
	void setPrice(float price);
	void setDescription(String description);
	void addDecorator(IDecorator decorator);
}
