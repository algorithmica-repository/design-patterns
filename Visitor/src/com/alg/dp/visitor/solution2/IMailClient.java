package com.alg.dp.visitor.solution2;

public interface IMailClient {
	
	void accept(IVisitor visitor);
	void send(EmailDetails email);
	EmailDetails receive();

}
