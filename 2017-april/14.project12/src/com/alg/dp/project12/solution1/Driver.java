package com.alg.dp.project12.solution1;

public class Driver {

	public static void main(String[] args) {
		Directory root = new Directory("/");
		Directory home = new Directory(root, "/home");
		Directory bin = new Directory(root, "/bin");
		
		File file1 = new File(home, "file1.txt");
		File file2 = new File(bin, "file2.bin");
		Directory user1 = new Directory(home, "/user1");
		
		System.out.println("Traverse-" + root.getName());
		root.traverse();
		System.out.println("Traverse-" +home.getName());
		home.traverse();
		System.out.println("Traverse-" + bin.getName());
		bin.traverse();
		
		System.out.println("find-" + root.getName());
		root.find("file1");
		System.out.println("find-" + bin.getName());
		bin.find("file1");
	}

}
