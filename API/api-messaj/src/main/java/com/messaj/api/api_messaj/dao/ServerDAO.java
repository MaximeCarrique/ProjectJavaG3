package com.messaj.api.api_messaj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.messaj.api.api_messaj.model.Server;
import com.messaj.api.api_messaj.model.ServerHeader;

public class ServerDAO {
	
	/**
	 *  get the servers by a given login
	 * @param login
	 * @return List of server the user can access
	 */
	public static List<ServerHeader> getServerByLogin(String login){
				
		Connection conn;
		List<ServerHeader> servers= new ArrayList<>();
		try {
			// getting the connection
			conn = DBConnection.getConnection();
			
			// preparing the statement to avoid SQL injection
			PreparedStatement getServers = conn.prepareStatement(
					"SELECT id, name, adminLogin "
					+ "FROM svr "
					+ "INNER JOIN rights ON svr.id = rights.svrId "
					+ "WHERE rights.usrLogin = ? OR svr.adminLogin = ?;");
			getServers.setString(1, login);
			getServers.setString(2, login);
			getServers.execute();
			
			// reading results
			ResultSet rs = getServers.getResultSet();
			while(rs.next()) {
				
				ServerHeader s = new ServerHeader();
				s.setId(rs.getString("id"));
				s.setName(rs.getString("name"));
				s.setIsAdmin(login.equals(rs.getString("adminLogin")));
				servers.add(s);
			}
			conn.close();
		} catch (SQLException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return servers;
	}
}
