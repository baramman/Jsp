package kr.co.farmstory1.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	
	// ?̱??? ??ü
	private static DBConfig instance = new DBConfig();

	public static DBConfig getInstance() {
		return instance;
	}
	
	private DBConfig() {}
	
	private final String HOST = "jdbc:mysql://chhak.or.kr:3306/tempest1389";
	private final String USER = "tempest1389";
	private final String PASS = "1234";
	
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(HOST, USER, PASS);
		return conn;
	}
	
}
