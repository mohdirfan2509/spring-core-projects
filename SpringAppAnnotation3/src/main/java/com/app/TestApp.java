package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Student;
import com.app.config.MyAppConfig;

public class TestApp {

	public static void main(String[] args) {
	
		
//		1.start the container
		AnnotationConfigApplicationContext container =new AnnotationConfigApplicationContext(MyAppConfig.class);
		
//		2.ask the container to create the object 
		Student std=container.getBean("student", Student.class);
		
//		3.use the object(bean) 
		System.out.println(std);
		
//		4.close the container 
		container.close();

	}

}
