package in.pw.ioi;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		step 1: activate hibernate Environment
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction transaction= session.beginTransaction();
		boolean flag=false;
		Student std=null;
		try {
//			   std= new Student("Dhoni",43,"Chennai");
			   std= new Student(35,"Dhoni",43,"Chennai");
			   session.merge(std);  // SELECT / INSERT / UPDATE query sent to the database for execution : result : cache
//			   if object is supplied with id and if id exists in the database  : SELECT + UPDATE Query
//			   if object is supplied without id and if data doesn't exist then : INSERT Query
			   
			   flag=true;
		}catch(Exception e) {
			flag=false;
			e.printStackTrace();
		}
		
		if(flag) {
			System.in.read();
			transaction.commit(); //  from cache --> pushed to database
			System.out.println(std);
			System.out.println("Record merged(updated) to database");
			
		}else {
			transaction.rollback();
			System.out.println("Record not merged(updated) to database");
		}
	

	}

}
