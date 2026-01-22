package in.pw.ioi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@SpringBootApplication
public class SpringBootDay01JdbcApp01Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container= SpringApplication.run(SpringBootDay01JdbcApp01Application.class, args);
		JdbcTemplate bean=container.getBean("jdbcTemplate", JdbcTemplate.class);
		NamedParameterJdbcTemplate namedParameterJdbcTemplate=container.getBean("namedParameterJdbcTemplate",NamedParameterJdbcTemplate.class);
		System.out.println(namedParameterJdbcTemplate);
		System.out.println(bean);
	}

}
