package com.alg.oodesign.solution1;

public class AbstractSmartConnection {
	private String username;
	private String password;
	
	public AbstractSmartConnection(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public IConnection connect(String url) {
		return Factory.getConnection(url, username, password);
	}
}
