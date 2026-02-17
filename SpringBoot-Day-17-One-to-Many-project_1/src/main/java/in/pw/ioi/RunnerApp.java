package in.pw.ioi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.pw.ioi.model.Person;
import in.pw.ioi.model.PhoneNumber;
import in.pw.ioi.service.PersonService;



@SpringBootApplication
public class RunnerApp implements CommandLineRunner {
    
	private PersonService personService;

	public RunnerApp(PersonService personService) {
		super();
		this.personService = personService;
	}

	public static void main(String[] args) {
		System.out.println("************Container Started**********");
		SpringApplication.run(RunnerApp.class, args);
		System.out.println("************Container Stopped**********");
	}

	@Override
	public void run(String... args) throws Exception {
		
		Person p1= new Person(101,"Sachin","Mumbai");
		PhoneNumber num1= new PhoneNumber(10001,"8074355902","Jio","OFFICE_USE",p1);
		
		
		personService.savePerson(p1);
		
	}

}
