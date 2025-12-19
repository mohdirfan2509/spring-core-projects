package com.app.dao;

public class Dao {
	private String uName;
	private String uPassword;
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	@Override
	public String toString() {
		return "Dao [uName=" + uName + ", uPassword=" + uPassword + "]";
	}
	
	

}
