package in.pw.ioi.test;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestApp {

	public static void main(String[] args) throws IOException {
		

		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		Transaction transaction =session.beginTransaction();
		int rowCount= session.createNamedMutationQuery("Student.deleteById").executeUpdate();
		System.out.println(rowCount);
		transaction.commit();
		
		
		
	}
	
}	
	   
		
		
	


