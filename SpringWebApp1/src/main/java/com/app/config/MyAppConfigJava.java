package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:mydata.properties")
public class MyAppConfigJava {
	
	@Autowired
	private Environment env;
	
	@Bean
	public Dao obj(){
		System.out.println("******************");
		
	}
	

}
