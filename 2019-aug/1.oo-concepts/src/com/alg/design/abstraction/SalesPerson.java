package com.alg.design.abstraction;

public class SalesPerson {
	int cars_sold;
	float commission_rate;
	String name;
	String aadhar_id;	

	public SalesPerson(float commission_rate, String name, String aadhar_id) {
		super();
		this.commission_rate = commission_rate;
		this.name = name;
		this.aadhar_id = aadhar_id;
	}
	boolean saleCar() {
		return true;
	}
	int reportSales() {
		return 0;
	}
	
	public static void main(String[] args) {
		SalesPerson p1 = new SalesPerson(0.01f, "abc", "123456");
		p1.commission_rate = 0.03f;
		System.out.println(p1.reportSales());
	}

}
