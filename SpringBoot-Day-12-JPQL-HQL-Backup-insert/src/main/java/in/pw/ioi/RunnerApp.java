package in.pw.ioi;

import java.util.List;
import java.util.Optional;

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
//		}
		
//		List<String> names =dao.getOneColumn();
//		System.out.println(names);
		
//		Optional<List<StudentTab>> student=dao.getwithId(5);
//		System.out.println(student);
		
//		List<Object[]> students= dao.getTwoColumns("Gopal",33);
//		for(Object[] student:students) {
//			
//			Object name=student[0];
//			Object age=student[1];
//			
//			System.out.println(name);
//			System.out.println(age);
//		
//		}
		
//		Optional<String> opt=dao.getName("Gopal");
//		if(opt.isPresent()) {
//			
//			String name=opt.get();
//			System.out.println(name);
//		}
		
//		int  RowCount=dao.insertRow();
//		System.out.println(RowCount);
		
		int RowCount=dao.insertRowToBackUp();
		System.out.println(RowCount);

	
	}

}
