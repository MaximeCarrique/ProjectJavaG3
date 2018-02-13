package com.messaj.api.api_messaj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import com.messaj.api.api_messaj.model.User;

public class UserDAO {
	public static Boolean InsertUser(User usr){
		Connection conn;
		try {
			conn = DBConnection.getConnection();
			
			PreparedStatement insertUser = conn.prepareStatement("INSERT INTO usr(login, passHash) VALUES (? , ?);");
			insertUser.setString(1, usr.getLogin());
			insertUser.setString(2, usr.hashPassword());
			insertUser.executeUpdate();
			conn.close();
			return true;
		} catch (SQLException | IllegalAccessException | InstantiationException | ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static Boolean LoginUser(User usr) {
		Connection conn;
		Boolean returnValue = false;
		try {
			conn = DBConnection.getConnection();
			
			PreparedStatement loginUser = conn.prepareStatement("SELECT 1 FROM usr WHERE login = ? AND passHash = ?;");
			loginUser.setString(1, usr.getLogin());
			loginUser.setString(2, usr.hashPassword());
			loginUser.execute();
			
			if (loginUser.getResultSet().first()) {
				returnValue = true;
			}
		} catch (SQLException | IllegalAccessException | InstantiationException | ClassNotFoundException  e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}