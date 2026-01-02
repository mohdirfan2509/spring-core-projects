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
//			   
			   std= new Student(33,"Dhoni",43,"Chennai");
			   session.remove(std);  // delete query sent to the database for execution : result : cache

			   
			   flag=true;
		}catch(Exception e) {
			flag=false;
			e.printStackTrace();
		}
		
		if(flag) {
			System.in.read();
			transaction.commit(); //  from cache --> pushed to database
			System.out.println(std);
			System.out.println("Record deleted to database");
			
		}else {
			transaction.rollback();
			System.out.println("Record not deleted to database");
		}
	

	}

}
