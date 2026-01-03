package in.pw.ioi;



import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		step 1: activate hibernate Environment
		Session session= new Configuration().configure().buildSessionFactory().openSession();
	
//		get it from L1 cache
		System.in.read();
		Student std= session.find(Student.class,1);
	    System.out.println(std);
	    
	    
	    session.evict(std);
	    System.out.println("Object is cleared");
	    System.in.read();
	    std=session.find(Student.class,1);
	    System.err.println(std);
	    
	    
		}
	

	}
