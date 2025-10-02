package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages= {"com.app"})
@PropertySource("classpath:mydata.properties")
public class MyAppConfig {
	
	public MyAppConfig() {
		System.out.println("MyAppConfig object is created..");
	}


}
