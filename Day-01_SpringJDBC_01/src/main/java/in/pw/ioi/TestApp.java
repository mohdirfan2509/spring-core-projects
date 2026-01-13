package in.pw.ioi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.pw.ioi.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cfg= new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(cfg.getBean("jdbcTemplate"));
		cfg.close();
	}

}
