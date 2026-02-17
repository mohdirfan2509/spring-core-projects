package in.pw.ioi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.pw.ioi.dao.ICourseRepository;
import in.pw.ioi.dao.IStudentRepository;
import in.pw.ioi.model.Course;
import in.pw.ioi.model.Student;



@SpringBootApplication
public class RunnerApp implements CommandLineRunner {
    
//	private StudentService stdService;
	
	 @Autowired
	 private  IStudentRepository studentDao;
	 
	 @Autowired
	 private  ICourseRepository courseDao;
	 
	 
	
	
	
//	public RunnerApp(StudentService stdService) {
//		super();
//		this.stdService = stdService;
//	}

	public static void main(String[] args) {
		System.out.println("************Container Started**********");
		SpringApplication.run(RunnerApp.class, args);
		System.out.println("************Container Stopped**********");
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Course c1= new Course(101,"COU1",5000);
		Course c2= new Course(102,"COU2",9000);
		Course c3= new Course(103,"COU3",2000);
		
		List<Course> lcourses1=Arrays.asList(c1,c2,c3);
//		courseDao.saveAllAndFlush(lcourses1);
		List<Course> lcourses2=Arrays.asList(c1,c2);
		List<Course> lcourses3=Arrays.asList(c2,c3);
		
		Student std1= new Student(1,"Sachin@gmail.com","Sachin",lcourses1);
		Student std2= new Student(2,"Rohith@gmail.com","Rohith",lcourses2);
		Student std3= new Student(3,"Siraj@gmail.com","Siraj",lcourses3);
		
		List<Student> lstds=Arrays.asList(std1,std2,std3);
		
//		studentDao.saveAllAndFlush(lstds);
		Optional<Student> opt=studentDao.findById(1);
		System.out.println(opt);
		
		
	
	    
		
		
		
		
 
	}

}
