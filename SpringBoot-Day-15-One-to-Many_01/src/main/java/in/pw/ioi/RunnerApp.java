package in.pw.ioi;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.pw.ioi.dao.IProductsRepository;
import in.pw.ioi.dao.IVariantRepository;
import in.pw.ioi.model.Products;
import in.pw.ioi.model.Variant;


@SpringBootApplication
public class RunnerApp implements CommandLineRunner {
    
//	private StudentService stdService;
	
	 @Autowired
	 private  IProductsRepository productsDao;
	 
	 @Autowired
	 private  IVariantRepository variantDao;
	 
	 
	
	
	
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
		
		
		Products product1= new Products(100,"Iphone16","10000");
		
		productsDao.save(product1);
		
		Variant var1= new Variant(20,"8GB",product1);
		Variant var2= new Variant(21,"16GB",product1);
		Variant var3= new Variant(22,"32GB",product1);
		
		List<Variant> variants= Arrays.asList(var1,var2,var3);
		
		variantDao.saveAllAndFlush(variants);
		
	     
	    
		
		
		
		
 
	}

}
