package com.alg.dp.project10.solution1;

import java.util.LinkedList;
import java.util.List;

public class Bank {
	private static Bank instance;
	private List<Account> accounts;
	
	private Bank() {
		accounts = new LinkedList<Account>();
	}
	
	public static Bank getInstance() {
		if(instance == null)
			instance = new Bank();
		return instance;
	}
	
	public void addAccount(Account account) {
		//System.out.println("add account");
		accounts.add(account);
	}
	
	public void display() {
		System.out.println(accounts);
	}
	
}
