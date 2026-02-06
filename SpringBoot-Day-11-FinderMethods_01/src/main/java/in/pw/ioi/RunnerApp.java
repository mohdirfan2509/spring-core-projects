package in.pw.ioi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.pw.ioi.dao.IStudentDao;
import in.pw.ioi.model.StudentTab;
import in.pw.ioi.service.StudentService;

@SpringBootApplication
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
		
//		List<StudentTab> students=dao.findByStdName("Naresh");
//		System.out.println(students);
		
//		List<StudentTab> students=dao.findByStdNameIs("Naresh");
//		System.out.println(students);
//		
//		List<StudentTab> students=dao.findByStdNameEquals("Naresh");
//		System.out.println(students);
//		
//		List<StudentTab> students=dao.findByStdAddress("Raipur");
//		System.out.println(students);
//		
//		List<StudentTab> students=dao.findByStdAgeLessThan();   // *******
//		System.out.println(students);
//		
//		List<StudentTab> students=dao.findByStdAgeLessThanEquals();  // *******
//		System.out.println(students);
//		
		List<StudentTab> students=dao.findByStdNameIsNull("Naresh");
		System.out.println(students);
//		
//		List<StudentTab> students=dao.findByStdNameIsNotNull();
//		System.out.println(students);
//		
//		List<StudentTab> students=dao.findByStdNameLike();
//		System.out.println(students);
//		
//		List<StudentTab> students=dao.findByStdNameStartingWith();
//		System.out.println(students);
//		
//		List<StudentTab> students=dao.findByStdNameEndingWith();
//		System.out.println(students);
//		
//		List<StudentTab> students=dao.findByStdNameContaining();
//		System.out.println(students);
//		
//		List<StudentTab> students=dao.findByStdAgeLessThanEqualOrStdNameLike();
//		System.out.println(students);
	
	}

}
