package in.pw.ioi.test;

import java.io.IOException;


import org.hibernate.Session;
import org.hibernate.Transaction;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		Transaction transaction= session.beginTransaction();
		int students=session.createNamedMutationQuery("Student.insertIntoStudentBackUp").setParameter("age",20).executeUpdate();
		transaction.commit();
		
		
		
		
	}
	
}	
	   
		
		
	


