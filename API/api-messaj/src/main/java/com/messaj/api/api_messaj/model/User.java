package com.messaj.api.api_messaj.model;

import java.util.Base64;

import org.apache.commons.codec.digest.DigestUtils;

public class User {
	private String login;
	private String password;

	private static final String SALT_PASS_HASH = "oipj('!::;,yguy*ù$^*ù*ù('*ù-(*'èù-*ù\"\"éù*'";

	
	
	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public String hashPassword() {
		return DigestUtils
				.sha1Hex(SALT_PASS_HASH + this.password + Base64.getEncoder().encodeToString(this.login.getBytes()));
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
