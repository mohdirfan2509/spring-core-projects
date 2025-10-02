package com.app.bean;

public class Customer {
	private String cName;
	
	public Customer() {
		
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcName() {
		return cName;
	}

	@Override
	public String toString() {
		return "Customer [cName=" + cName + "]";
	}
	
	 

}
