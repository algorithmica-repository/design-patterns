package com.alg.dp.memento.solution3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Stack;

public class InventoryCareTaker {
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private Stack<Memento> stack;
	
	public InventoryCareTaker(String file) throws Exception {
		stack = new Stack<Memento>();
		oos = new ObjectOutputStream(new FileOutputStream(file));
		ois = new ObjectInputStream(new FileInputStream(file));
	}
	
	public void commit(Memento memento) throws Exception {
		stack.push(memento);
		oos.writeObject(stack);
	}
	
	public Memento rollback() throws Exception {
		stack = (Stack<Memento>) ois.readObject();
		return stack.pop();
	}

}
