package in.pw.ioi.test;

import java.io.IOException;


import org.hibernate.Session;
import org.hibernate.Transaction;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws IOException {
		int noOfPages=0;
		int offSet=0;
		 
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		int records=session.createNamedQuery("Student.pagination").executeUpdate();
		
		
		
		
	}
	
}	
	   
		
		
	


