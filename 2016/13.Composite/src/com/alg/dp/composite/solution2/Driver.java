package com.alg.dp.composite.solution2;

import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		Entry mycomputer = new Directory("MyComputer", new Date());
		Entry cdrive = new Directory("C", new Date());
		Entry ddrive = new Directory("D", new Date());
		
		Entry dp = new Directory("design", new Date());
		dp.add(new File("abc.txt", 100, new Date()));
		dp.add(new File("def.txt", 200, new Date()));
		cdrive.add(dp);
		
		ddrive.add(new File("pqr.txt", 400, new Date()));
		
		mycomputer.add(cdrive);
		mycomputer.add(ddrive);
		
		System.out.println(mycomputer.size());

	}

}
