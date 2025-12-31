package in.pw.ioi.test;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws IOException {
		int noOfPages=0;
		int offSet=0;
		int pageSize=4;
		 
		Session session= new Configuration().configure().addAnnotatedClass(Student.class).openSession();
//		int records=session.createNamedQuery("Student.pagination").executeUpdate();
		
		
		
		
	}
	
}	
	   
		
		
	


