package in.pw.ioi;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.pw.ioi.entity.Person;


public class TestApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		step 1: activate hibernate Environment
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction transaction= session.beginTransaction();
		boolean flag=false;
		
		try {  
			   java.util.Date dob= new java.util.Date(2025-1990,12,02);
			   java.util.Date dom= new java.util.Date(2025-1990,12,02,5,20,50);
			   java.util.Date doj= new java.util.Date(2025-1990,12,02);
			   Person person= new Person("Shaquib Bhai",dob,dom,doj);
			   session.persist(person);  //insert query sent to the database for execution : result : cache
			   flag=true;
		}catch(Exception e) {
			flag=false;
			e.printStackTrace();
		}
		
		if(flag) {
			transaction.commit();
			System.out.println("Record saved to database");
			
		}else {
			transaction.rollback();
			System.out.println("Record saved to database");
		}
	

	}

}
