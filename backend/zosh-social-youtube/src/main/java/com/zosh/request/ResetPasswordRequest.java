package com.zosh.request;

import lombok.Data;

@Data
public class ResetPasswordRequest {
	
	public ResetPasswordRequest(String password, String token) {
		super();
		this.password = password;
		this.token = token;
	}
	private String password;
	private String token;
	
	public ResetPasswordRequest() {
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}


}
