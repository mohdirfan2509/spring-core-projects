package in.pw.ioi.test;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		
		Transaction transaction= session.beginTransaction();
		
		boolean flag=false;
		
		try {
			Student s1= new Student("Supra",30,"Pune");
			session.persist(s1);
			flag=true;
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(flag) {
			System.in.read();
			transaction.commit();
			System.out.println("Record saved to  database successfully !!");
		}else {
			transaction.rollback();
			System.out.println("Sorry !! record not saved to  database !!");
		}
	}

}
