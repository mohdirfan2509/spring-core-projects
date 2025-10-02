package com.app.bean;

public class OrderServices {
	
	private Product product;
	private Customer customer;
	public OrderServices(Product product, Customer customer) {
		super();
		this.product = product;
		this.customer = customer;
	}
	
	
	
	public void order() {
		System.out.println(product.getpName() +" is purchased by the customer : "+customer.getcName());

	}
	
}
