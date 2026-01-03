package in.pw.ioi;



import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		step 1: activate hibernate Environment
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		
//		Check in L1 not there, Check in L2 not there
//		hit db --> SELECT Query is generated 
		Student student=session.find(Student.class,10);
		System.out.println(student);
		
		System.in.read(); // thread is paused
		
//		Get it from L1 Cache
		student=session.find(Student.class,10);
		System.out.println(student);
		System.out.println("got the object from L1 cache so no SELECT query ");
		
//		remove from L1 cache
		session.evict(student);	
		System.out.println("Object is removed from L1 Cache !!");
		
		System.in.read(); // thread is paused
		
//		hit db -->SELECT query is generated because the Object is cleared from L1 cache
//		So after searching in L1 cache it goes to L2 cache but we have not configured the L2 cache
		student=session.find(Student.class,10);
		System.out.println(student);
		System.out.println("SELECT Query --> hits the DB because we don't have the object in L1 and we have not configured the L2 cache");
		
		
	

	    
		}
	

	}
