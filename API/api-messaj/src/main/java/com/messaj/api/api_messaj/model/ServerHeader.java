package com.messaj.api.api_messaj.model;

public class ServerHeader {
	private String id;
	private String name;
	private Boolean isAdmin;
	
	public ServerHeader(String id, String name, Boolean isAdmin) {
		this.id = id;
		this.name = name;
		this.isAdmin = isAdmin;
	}
	
	public ServerHeader() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	};

}
