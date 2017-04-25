package com.alg.dp.project7.solution1;

public class Driver {

	public static void main(String[] args) {
		Square[] squares = new Square[20];
		
		squares[0] = new Square(0, 10);
		squares[1] = new Square(1, 15);
		
		squares[0].move(5, 5);
		squares[0].scale(2);
		System.out.println(squares[0].toString());
		
		squares[1].scale(3);
		System.out.println(squares[1].toString());

	}

}
