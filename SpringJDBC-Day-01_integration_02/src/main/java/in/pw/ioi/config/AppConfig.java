package in.pw.ioi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "in.pw.ioi")
public class AppConfig {
	
	@Bean
	public DataSource ds() {
		
	}

}
