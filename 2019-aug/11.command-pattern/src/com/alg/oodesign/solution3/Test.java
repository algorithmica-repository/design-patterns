package com.alg.oodesign.solution3;

public class Test {

	public static void display(IShape[] shapes) {
		for(IShape s: shapes)
			System.out.println(s);
		System.out.println();
	}
	public static void main(String[] args) {
		IShape[] shapes = new IShape[3];		
		shapes[0] = new Square(0, 5);
		shapes[1] = new Square(1, 10);
		shapes[2] = new Rectangle(2, 3, 4);
		
		CommandManager cmgr = new CommandManager();		
		display(shapes);
		cmgr.move(shapes[0], 2, 3 );
		display(shapes);
		cmgr.move(shapes[2], 3, 4);
		display(shapes);
		cmgr.rotate(shapes[2]);
		display(shapes);
		cmgr.undo();
		display(shapes);	
		cmgr.undo();
		display(shapes);
		cmgr.redo();
		display(shapes);	
	}

}
