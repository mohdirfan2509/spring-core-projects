package in.pw.ioi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.pw.ioi.dao.IProductDao;
import in.pw.ioi.model.Product;


@SpringBootApplication
public class RunnerApp implements CommandLineRunner {
    
//	private StudentService stdService;
	
	 @Autowired
	  private IProductDao dao;
	
	
	
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
		
		List<String> colors= Arrays.asList("Blue","Red","Green");
		
		HashSet<String> models=new HashSet();
		models.add("M1");
		models.add("M2");
		models.add("M3");
		
		HashMap<String,String> details= new HashMap();
		details.put("D1","ABC");
		details.put("D2","XYZ");
		details.put("D3","MNO");
		
		Product product= new Product("1002",colors,models,details);
		
		dao.saveAndFlush(product);
		
		
	
		 
	}

}
