package com.alg.dp.project10.solution1;

public class Account {
	private int id;
	private String name;
	private String type;
	private float balance;
	
	public Account(int id, String name, String type, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", type=" + type
				+ ", balance=" + balance + "]";
	}
	
	

}
