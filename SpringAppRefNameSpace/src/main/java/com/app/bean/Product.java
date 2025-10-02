package com.app.bean;

public class Product {
	private String pName;
	
	public Product() {
		
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpName() {
		return pName;
	}

	@Override
	public String toString() {
		return "Product [pName=" + pName + "]";
	}
	
	

}
