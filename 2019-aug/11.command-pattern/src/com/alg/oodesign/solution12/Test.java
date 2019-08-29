package com.alg.oodesign.solution12;

public class Test {

	public static void display(Square[] squares) {
		for(Square s: squares)
			System.out.println(s);
		System.out.println();
	}
	public static void main(String[] args) {
		Square[] squares = new Square[2];		
		squares[0] = new Square(0, 5);
		squares[1] = new Square(1, 10);
		
		CommandManager cmgr = new CommandManager();		
		display(squares);
		cmgr.move(squares[0], 2, 3 );
		display(squares);
		cmgr.scale(squares[1], 5);
		display(squares);
		cmgr.undo();
		display(squares);	
		cmgr.undo();
		display(squares);
		cmgr.redo();
		display(squares);
		cmgr.redo();
		display(squares);
		
	}

}
