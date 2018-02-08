package com.messaj.api.api_messaj.model;

public class Server {

	private String id;
	private String name;
	private String address;
	private String port;
	private User admin;

	public Server(String id, String name, String address, String port, User admin) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.port = port;
		this.admin = admin;
	}

	public Server() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
