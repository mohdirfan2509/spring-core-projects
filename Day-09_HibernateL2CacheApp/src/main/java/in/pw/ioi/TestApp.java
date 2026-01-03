package in.pw.ioi;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		step 1: activate hibernate Environment
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();	  
		
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
		
//		L1 -> not there, L2 -> available -> give it to L1 --> L1 to application
		student=session.find(Student.class,10);
		System.out.println(student);

		System.in.read(); // Thread is paused
		
//		L1 -> available
		student=session.find(Student.class,10);
		System.out.println(student);
		
		session.clear(); // Remove all objects in L1 cache
		
		System.in.read();
		 
//		Remove from L2 cache
		factory.getCache().evictEntityData(Student.class,11);
		System.out.println("Removed from L2 cache...");
		
		System.in.read();
		
//		check in L1 -> not there. check in L2 not there
//		hit db --> SELECT query generated 
		student=session.find(Student.class,10);
		System.out.println(student);
	
		
		}
	

	}
