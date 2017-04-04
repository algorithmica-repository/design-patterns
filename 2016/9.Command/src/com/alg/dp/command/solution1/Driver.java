package com.alg.dp.command.solution1;

public class Driver {

	public static void main(String[] args) {
		Square[] squares = new Square[100];
		
		squares[0] = new Square(0, 4);
		System.out.println(squares[0]);
		squares[0].scale(5);
		System.out.println(squares[0]);
		squares[0].move(-2, 5);
		System.out.println(squares[0]);
		
	}

}
