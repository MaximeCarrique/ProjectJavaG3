package com.messaj.api.api_messaj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DBConnection {

	public static Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
//		MysqlDataSource dataSource = new MysqlDataSource();
//		dataSource.setUser("root");
//		dataSource.setPassword("test");
//		dataSource.setServerName("localhost");
//		
//		//jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
//		return dataSource.getConnection();
//		
		
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		String url = "jdbc:mysql://localhost/MessageDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		return DriverManager.getConnection(url, "root", "test");
		
		
		  
	}

}
