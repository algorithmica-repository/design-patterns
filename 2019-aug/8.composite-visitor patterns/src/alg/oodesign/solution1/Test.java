package com.alg.oodesign.solution1;

public class Test {

	public static void main(String[] args) {
		Letter l1 = new Letter("letter1", 10);
		Book b1 = new Book("book1", 200);
		Book b2 = new Book("book2", 400);
		
		Box box1 = new Box("box1");
		box1.addItem(b1);
		box1.addItem(l1);
		box1.display();
		System.out.println(box1.getWeight());
		System.out.println();
		
		Box box2 = new Box("box2");
		box2.addBox(box1);
		box2.addItem(b2);
		box2.display();
		System.out.println(box2.getWeight());

		
	}

}
