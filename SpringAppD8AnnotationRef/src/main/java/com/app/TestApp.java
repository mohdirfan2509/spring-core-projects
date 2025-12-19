package com.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.config.AppConfig;
import com.app.service.Service;


public class TestApp {
	public static void main(String[] args) {
		
//		1.start the container
	ApplicationContext container =new AnnotationConfigApplicationContext(AppConfig.class);
		
		
	 String[] beanNames =container.getBeanDefinitionNames();
	 for(String bean:beanNames){
		 System.out.println(bean);
	 }
//		2.ask the container to give the object
	Service service=container.getBean(Service.class);
		
//		3.use the object
	
	System.out.println(service);
		
//		4.close the container
	((AbstractApplicationContext)container).close();
	}

}
