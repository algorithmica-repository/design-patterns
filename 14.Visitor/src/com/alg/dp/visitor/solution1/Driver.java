package com.alg.dp.visitor.solution1;

public class Driver {

	public static void main(String[] args) {
		IMailClient omc = new OperaMailClient();
		omc.configureWindows();
		omc.send(new EmailDetails());
		
		omc.configureMac();
		omc.send(new EmailDetails());

	}

}
