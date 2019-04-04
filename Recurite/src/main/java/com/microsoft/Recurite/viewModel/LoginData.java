package com.microsoft.Recurite.viewModel;

public class LoginData{
	private boolean success;
	private String message;
	private String token;
	private String userName;
	private String name;
	
	public LoginData() {
		super();
	}
	public LoginData(boolean success, String message, String token, String userName, String name) {
		super();
		this.success = success;
		this.message = message;
		this.token = token;
		this.userName = userName;
		this.name = name;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}