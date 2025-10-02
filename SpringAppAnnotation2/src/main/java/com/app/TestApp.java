package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Student;
import com.app.config.MyAppConfig;

public class TestApp {
	
	public static void main(String[] args) {
		
//		1.Start the container
		AnnotationConfigApplicationContext container =new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		
//		2.Ask the container to give the object
		Student student=container.getBean(Student.class);
		
		
//		3.use the object 
		System.out.println(student);
		
//		4.close the container
		container.close();
		
	}

}
