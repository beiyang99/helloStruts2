package com.test.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
   public String execute() throws Exception{
	   return "success";
   }
	
	//��Ӧ���ϵ�
	private String username;
	private String password;
}

