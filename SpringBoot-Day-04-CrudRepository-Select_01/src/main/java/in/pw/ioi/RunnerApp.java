package in.pw.ioi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.pw.ioi.model.StudentTab;
import in.pw.ioi.service.StudentService;
import jakarta.persistence.EntityNotFoundException;

@SpringBootApplication
public class RunnerApp implements CommandLineRunner {
    
	private StudentService stdService;
	
	
	
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
		
		try {
			StudentTab student=stdService.findStudentById(1);
			System.out.println(student);
		} catch (EntityNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		
        
		
	}

}
