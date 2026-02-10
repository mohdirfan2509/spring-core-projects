package in.pw.ioi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.pw.ioi.dao.IDepartmentRepository;
import in.pw.ioi.dao.IEmployeeRepository;
import in.pw.ioi.model.Department;
import in.pw.ioi.model.Employee;


@SpringBootApplication
public class RunnerApp implements CommandLineRunner {
    
//	private StudentService stdService;
	
	 @Autowired
	 private  IEmployeeRepository empDao;
	 
	 @Autowired
	 private  IDepartmentRepository deptDao;
	 
	 
	
	
	
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
		
		Department dept1=new Department(100,"CSE","BLR");
		Department dept2=new Department(101,"ECE","HYD");
		Department dept3=new Department(102,"EEE","PUNE");
		
		deptDao.save(dept1);
		deptDao.save(dept2);
		deptDao.save(dept3);
		
		Employee emp1= new Employee(10,"Sachin","MI",dept1);
		Employee emp2= new Employee(7,"Dhoni","CSK",dept2);
		Employee emp3= new Employee(18,"Kohli","RCB",dept3);
		
		
		List<Employee> employees=List.of(emp1,emp2,emp3);
		empDao.saveAllAndFlush(employees);
		
		
 
	}

}
