package in.pw.ioi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.pw.ioi.dao.IStudentDao;
import in.pw.ioi.model.StudentTabDTO;
import in.pw.ioi.service.StudentService;

@SpringBootApplication
@EntityScan(basePackages="in.pw.ioi.model")
@EnableJpaRepositories(basePackages="in.pw.ioi.dao")
public class RunnerApp implements CommandLineRunner {
    
	@Autowired   
	private StudentService stdService;
	@Autowired
	private IStudentDao dao;
	
	
	
	public RunnerApp(StudentService stdService) {
		super();
		this.stdService = stdService;
	}

	public static void main(String[] args) {
		System.out.println("************Container Started**********");
		SpringApplication.run(RunnerApp.class, args);
		System.out.println("************Container Stopped**********");
	}

	@Override
	public void run(String... args) throws Exception {
		
//		List<StudentTab> students=dao.getAllRecords();
//		System.out.println(students);
		
//		List<Object[]> students=dao.getParticularColumns();
//		for(Object[] student:students) {
//			
//			Object name=student[0];
//			Object age=student[1];
//			
//			System.out.println(name);
//			System.out.println(age);
//		
//		}.
		
//		List<String> names =dao.getOneColumn();
//		System.out.println(names);
		
		List<StudentTabDTO> students=dao.getAllDTO();
		System.out.println(students);
		
		
	
	 
	}

}
