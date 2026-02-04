package in.pw.ioi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.pw.ioi.model.StudentTab;
import in.pw.ioi.service.StudentService;

@SpringBootApplication
public class SpringBootDay03CrudRepository01Application implements CommandLineRunner {
    
	private StudentService stdService;
	
	
	
	public SpringBootDay03CrudRepository01Application(StudentService stdService) {
		super();
		this.stdService = stdService;
	}

	public static void main(String[] args) {
		System.out.println("************Container Started**********");
		SpringApplication.run(SpringBootDay03CrudRepository01Application.class, args);
		System.out.println("************Container Stopped**********");
	}

	@Override
	public void run(String... args) throws Exception {
		
		StudentTab student= new StudentTab();
		student.setStdId(2);
		student.setStdName("Suresh");
		student.setStdAge(29);
		student.setStdAddress("Mumbai");
		StudentTab stdPresisted =stdService.saveStudent(student);
		System.out.println(stdPresisted);
		
        
		
	}

}
