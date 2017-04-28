package com.alg.dp.project10.solution1;

class Dummy extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getId());
		Bank.getInstance().addAccount(new Account(1, "abc", "savings", 10000));
		Bank.getInstance().addAccount(new Account(2, "def", "current", 15000));
		Bank.getInstance().display();
	}
}
public class Driver {
	
	public static void test1() {
		Bank bank1 = Bank.getInstance();
		bank1.addAccount(new Account(1, "abc", "savings", 10000));
		bank1.addAccount(new Account(2, "def", "current", 15000));
		bank1.display();
		
		Bank bank2 = Bank.getInstance();
		bank2.display();
	}
	
	public static void test2() {
		Thread t1 = new Dummy();
		Thread t2 = new Dummy();
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		test2();
	}

}
