package com.alg.dp.visitor.solution2;

public class WinConfigurationVisitor implements IVisitor {

	@Override
	public void visit(OperaMailClient omc) {
		System.out.println("Configuring OperaMail client for windows");

	}

	@Override
	public void visit(SquirrelMailClient smc) {
		System.out.println("Configuring SquirrelMail client for windows");

	}

}
