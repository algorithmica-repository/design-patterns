package com.alg.dp.visitor.solution2;

public class MacConfigurationVisitor implements IVisitor {

	@Override
	public void visit(OperaMailClient omc) {
		System.out.println("Configuring OperaMail client for mac");
		
	}

	@Override
	public void visit(SquirrelMailClient smc) {
		System.out.println("Configuring SquirrelMail client for mac");
		
	}

	
}
