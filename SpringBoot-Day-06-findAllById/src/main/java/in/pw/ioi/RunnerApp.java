package in.pw.ioi;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.pw.ioi.model.StudentTab;
import in.pw.ioi.service.StudentService;

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
		
		List<Integer> ids= List.of(1,2,5);
		
		Iterable<StudentTab> students=stdService.getAllByids(ids);
		
		for(StudentTab student:students){
			
			System.out.println(student);
		}
	}

}
