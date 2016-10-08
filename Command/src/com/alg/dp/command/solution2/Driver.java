package com.alg.dp.command.solution2;

public class Driver {

	public static void main(String[] args) {
		Square[] squares = new Square[100];
		Invoker invoker = new Invoker();
		
		squares[0] = new Square(0, 4);
		squares[1] = new Square(1, 10);
		invoker.print(squares[0]);

		invoker.scale(squares[0], 5);
		invoker.print(squares[0]);
		
		invoker.move(squares[0],-2, 5);
		invoker.print(squares[0]);
		
		invoker.scale(squares[1], 5);
		invoker.print(squares[1]);
		
		invoker.undo();
		invoker.print(squares[0]);
		invoker.print(squares[1]);
	}

}
