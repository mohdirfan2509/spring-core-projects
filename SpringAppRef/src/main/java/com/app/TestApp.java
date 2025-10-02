package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.OrderServices;

public class TestApp {

	public static void main(String[] args) {
		
		//1. start the container
		ApplicationContext container =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//2. use the object
		OrderServices service =container.getBean(OrderServices.class);
		
		service.order();
		
		
		//3. close the container
		((AbstractApplicationContext) container).close();
		
		

	}

}
