package com.alg.dp.command.solution4;

public class Driver {

	public static void main(String[] args) {
		Square[] squares = new Square[100];
		Invoker invoker = new Invoker();		
		
		squares[0] = new Square(0, 4);
		squares[1] = new Square(1, 10);
		invoker.invoke(new ScaleOperation(squares[0], 4));
		invoker.invoke(new MoveOperation(squares[0], -2, 5));
		invoker.undo();
		invoker.invoke(new PrintOperation(squares[0]));
		
	}

}
