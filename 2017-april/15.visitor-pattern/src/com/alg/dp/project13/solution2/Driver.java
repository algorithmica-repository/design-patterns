package com.alg.dp.project13.solution2;

public class Driver {

	public static void main(String[] args) {
		Directory root = new Directory("/");
		Directory home = new Directory(root, "/home");
		Directory bin = new Directory(root, "/bin");
		
		File file1 = new File(home, "file1.txt");
		File file2 = new File(bin, "file2.bin");
		Directory user1 = new Directory(home, "/user1");
		
		TraversalVisitor visitor1 = new TraversalVisitor();
		root.accept(visitor1);
		System.out.println();
		home.accept(visitor1);
		System.out.println();
		bin.accept(visitor1);		
		System.out.println();
		SizeVisitor  visitor2 = new SizeVisitor();
		root.accept(visitor2);
		visitor2.report();
		System.out.println();
		SizeVisitor  visitor3 = new SizeVisitor();
		bin.accept(visitor3);
		visitor3.report();
	}

}
