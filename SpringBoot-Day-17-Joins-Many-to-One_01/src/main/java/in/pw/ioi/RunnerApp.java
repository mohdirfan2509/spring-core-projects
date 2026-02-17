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
	
	public static void main(String[] args) {
		System.out.println("************Container Started**********");
		SpringApplication.run(RunnerApp.class, args);
		System.out.println("************Container Stopped**********");
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		List<Object []> lst=empDao.getEnameDeptNames();
		
		for(Object [] obj:lst) {
			System.out.println("Hello print !!");
			System.out.println(obj[0].toString());
			System.out.println(obj[1].toString());
		}
		
 
	}

}
