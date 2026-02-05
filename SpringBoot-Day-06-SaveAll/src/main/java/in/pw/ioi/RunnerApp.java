package in.pw.ioi;

import java.util.ArrayList;
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
		
		List<StudentTab> students= new ArrayList<StudentTab>();
		students.add(new StudentTab("Gopal",33,"Kanpur"));
		students.add(new StudentTab("Alakh",39,"Ahmedabad"));
		students.add(new StudentTab("Prateek",30,"Karimnagar"));
		
		Iterable<StudentTab> presistedStudents= stdService.saveAllStudents(students);
		System.out.println(presistedStudents);
	}

}
