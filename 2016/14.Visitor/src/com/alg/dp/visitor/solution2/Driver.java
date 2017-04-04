package com.alg.dp.visitor.solution2;

public class Driver {

	public static void main(String[] args) {
		OperaMailClient omc = new OperaMailClient();
		IVisitor wcv = new WinConfigurationVisitor();
		omc.accept(wcv);
		wcv.visit(omc);
		
		IVisitor mcv = new MacConfigurationVisitor();
		omc.accept(mcv);
		mcv.visit(omc);
		
	}

}
