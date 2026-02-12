package in.pw.ioi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.pw.ioi.dao.IPassportRepository;
import in.pw.ioi.dao.IPersonRepository;
import in.pw.ioi.model.Passport;
import in.pw.ioi.model.Person;


@SpringBootApplication
public class RunnerApp implements CommandLineRunner {
    
//	private StudentService stdService;
	
	 @Autowired
	 private  IPersonRepository personDao;
	 
	 @Autowired
	 private  IPassportRepository passportDao;
	 
	 
	
	
	
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
		
		
		Person person1= new Person(1005,"Sachin","MI");
		
		personDao.save(person1);
		
		Passport passport1= new Passport(100,"India",person1);
		
		passportDao.save(passport1);
	
	    
		
		
		
		
 
	}

}
