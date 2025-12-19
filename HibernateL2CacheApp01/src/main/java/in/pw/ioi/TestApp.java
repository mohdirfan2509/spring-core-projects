package in.pw.ioi;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		step 1: activate hibernate Environment
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction transaction= session.beginTransaction();
		
		 //check in L1 not there , Check in L2 not there
	     //hit db ---> select query is genereated
	   Student std = session.find(Student.class,1);
	     System.out.println(std);

		System.in.read();//Thread is paused

		//Get it from L1 Cache
		std = session.find(Student.class,1);
	     	System.out.println(std);

		//remove from L1 cache
	        session.evict(std);
		System.out.println("Object is removed from L1Cache");

		System.in.read();//Thread is paused

		// L1 -> not there, L2 -> available -> give it to L1--> L1 to application
		std = session.find(Student.class,1);
	     	System.out.println(std);

		System.in.read();//Thread is paused

		//L1 -> available
		std = session.find(Student.class,1);
	     	System.out.println(std);

		session.clear(); // Remove all object in L1 Cache

		System.in.read();

	        //Remove from L2 cache
		factory.getCache().evictEntityData(Student.class, 1);
		System.out.println("Removed from L2 Cache...");

		System.in.read();


		 //check in L1 not there , Check in L2 not there
	        //hit db ---> select query is genereated
		std = session.find(Student.class,1);
	     	System.out.println(std);


	    
	    
		}
	

	}
