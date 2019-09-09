package com.alg.oodesign.solution1;

public class Factory {

	public static IConnection getConnection(String url, String username, String password) {
		if(url.equals("oracle"))
			return new OracleConnection();
		if(url.equals("mysql"))
			return new MySqlConnection();
		return null;
	}
}

