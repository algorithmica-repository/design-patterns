package com.alg.dp.singleton;

public class Driver {

	public static void main(String[] args) {
		Clipboard cb = Clipboard.getInstance();
		cb.setData("abc");
		System.out.println(cb.getData());

	}

}
