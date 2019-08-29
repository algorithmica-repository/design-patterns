package com.alg.oodesign.solution4;

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
		
		MoveCommand cmd1 = new MoveCommand(shapes[0], 2, 3);
		cmgr.invoke(cmd1);
		display(shapes);
		
		MoveCommand cmd2 = new MoveCommand(shapes[2], 4, 10);
		cmgr.invoke(cmd2);
		display(shapes);

		RotateCommand cmd3 = new RotateCommand(shapes[2]);
		cmgr.invoke(cmd3);
		display(shapes);
		
		cmgr.undo();
		display(shapes);
		
		cmgr.undo();
		display(shapes);
		
		cmgr.redo();
		display(shapes);	
	}

}
