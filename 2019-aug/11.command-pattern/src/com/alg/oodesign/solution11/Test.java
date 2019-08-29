package com.alg.oodesign.solution11;

public class Test {

	public static void main(String[] args) {
		Square[] squares = new Square[10];		
		squares[0] = new Square(0, 5);
		squares[1] = new Square(1, 10);
		
		System.out.println(squares[0]);
		squares[0].move(2, 3);
		System.out.println(squares[0]);
		
		System.out.println(squares[1]);
		squares[1].scale(3);
		System.out.println(squares[1]);
		
	}

}
