package com.alg.dp.visitor.solution2;

public class SquirrelMailClient implements IMailClient {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
		
	}

	@Override
	public void send(EmailDetails email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmailDetails receive() {
		// TODO Auto-generated method stub
		return null;
	}

}
