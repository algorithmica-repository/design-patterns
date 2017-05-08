package com.alg.dp.project12.solution2;

public class Driver {

	public static void main(String[] args) {
		Directory root = new Directory("/");
		Directory home = new Directory(root, "/home");
		Directory bin = new Directory(root, "/bin");
		
		File file1 = new File(home, "file1.txt");
		File file2 = new File(bin, "file2.bin");
		Directory user1 = new Directory(home, "/user1");
		
		root.traverse();
		System.out.println();
		home.traverse();
		System.out.println();
		bin.traverse();
		
		System.out.println();
		root.find("file1");
		System.out.println();
		bin.find("file1");
	}

}
