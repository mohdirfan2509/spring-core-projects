package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.app"})
public class MyAppConfig {
	static {
		System.out.println("MyAppConfig Class is loading");
	}
	public MyAppConfig(){
		System.out.println("MyAppConfig.class object is created by spring f/w..");
	}
	
}
