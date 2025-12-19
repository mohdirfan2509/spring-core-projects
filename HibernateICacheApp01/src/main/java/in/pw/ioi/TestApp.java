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
		
		try {
			   Student std= new Student("Rohith",44,"Mumbai");
			   session.persist(std);  //insert query sent to the database for execution : result : cache
			   flag=true;
		}catch(Exception e) {
			flag=false;
			e.printStackTrace();
		}
		
		if(flag) {
			System.in.read();
			transaction.commit();
			System.out.println("Record saved to database");
			
		}else {
			transaction.rollback();
			System.out.println("Record not saved to database");
		}
	

	}

}
