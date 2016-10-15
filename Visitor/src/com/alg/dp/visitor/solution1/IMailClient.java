package com.alg.dp.visitor.solution1;

public interface IMailClient {
	
	void configureWindows();
	void configureMac();
	void send(EmailDetails email);
	EmailDetails receive();

}
