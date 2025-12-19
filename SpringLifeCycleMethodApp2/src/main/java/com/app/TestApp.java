package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.service.ExcelImportService;

public class TestApp {
	
	public static void main(String[] args) throws Exception {
		
//		1.start the container
		ApplicationContext container =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
//		2.ask to container to get the object 
		
		ExcelImportService service =container.getBean("service",ExcelImportService.class);
		
//		3.use the object(bean)
		System.out.println(service); 
		
		
//		4.close the container
		Thread.sleep(5000);
		((AbstractApplicationContext)container).close();
		
		
		
		
	}

}
